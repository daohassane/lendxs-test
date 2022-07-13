import React, {useEffect, useState} from 'react';
import { DataGrid, GridToolbar } from '@mui/x-data-grid';
import { Container } from '@mui/material';

const columns = [
  { field: "id", headerName: "ID", width: 70 },
  { field: "name", headerName: "Name", width: 130 },
  { field: "phoneNumber", headerName: "Phone Number", width: 130 },
  { field: "email", headerName: "Email", width: 160 },
];


export default function User() {
    const[users, setUsers] = useState([]);

    useEffect(() => {
      fetch("http://localhost:8080/users")
        .then((res) => res.json())
        .then((result) => {
          setUsers(result);
        });
    }, []);

  return (
    <Container>
      <div style={{ height: 450, width: "100%", margin: "40px auto" }}>
        <DataGrid
          rows={users}
          columns={columns}
          components={{ Toolbar: GridToolbar }}
          pageSize={10}
          rowsPerPageOptions={[10]}
          checkboxSelection
        />
      </div>
    </Container>
  );
}
