import { useState } from "react";
import axios from "axios";

function App() {
  const BASE_URL = "http://localhost:8080";
  const [file, setFile] = useState<File | null>(null);

  const uploadFile = async () => {
    console.log(file);
    const data = new FormData();
    
    if(file) {
      data.append("userId", "testUser");
      data.append("fileUpload", file);
    }

    axios
      .post(BASE_URL + "/test/api", data, {
        headers: {
          "Content-Type": "multipart/form-data",
        },
      })
      .then((res) => {
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  };

  const handleFileChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const files = event.target.files;
    if (files && files.length > 0) {
      setFile(files[0]);
    }
  };

  return (
    <div>
      <h1>
        File Upload Page
        <input type="file" onChange={(e) => handleFileChange(e)} />
        <button onClick={uploadFile}>Upload File</button>
      </h1>
    </div>
  );
}

export default App;
