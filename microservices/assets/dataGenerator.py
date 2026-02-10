from openpyxl import Workbook
from datetime import datetime, timedelta
import random

wb = Workbook(write_only=True)
ws = wb.create_sheet("DummyData")

headers = [
    "id", "name", "email", "phone", "city",
    "country", "department", "salary", "status",
    "created_date", "updated_date", "age",
    "experience_years", "rating", "remarks"
]

ws.append(headers)

base_date = datetime(2020, 1, 1)

for i in range(1, 1_000_001):
    ws.append([
        i,
        f"User_{i}",
        f"user{i}@example.com",
        f"+92{random.randint(3000000000,3999999999)}",
        random.choice(["Karachi","Lahore","Islamabad","Peshawar","Quetta"]),
        "Pakistan",
        random.choice(["IT","HR","Finance","Ops","Support"]),
        random.randint(30000, 250000),
        random.choice(["ACTIVE","INACTIVE"]),
        base_date + timedelta(days=random.randint(0,1500)),
        base_date + timedelta(days=random.randint(1501,3000)),
        random.randint(20,55),
        random.randint(0,30),
        round(random.uniform(1,5),1),
        random.choice(["OK","GOOD","EXCELLENT","NEEDS REVIEW"])
    ])

wb.save("dummy_1M_rows_15_columns.xlsx")
print("Done")
