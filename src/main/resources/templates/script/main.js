const btn = document.querySelector('.btn');
window.addEventListener('load', () => {
    fetch("http://localhost:8080/api/")
        .then((response) => {
            const resultString = response.json();
            return resultString;
        })
        .then((data) => {
            console.log(data);
            let temp = "";
            data.forEach((elem) => {
                temp += "<tr class='table'>";
                temp += "<th>" + elem.id + "</th>";
                temp += "<td>" + elem.username + "</td>";
                temp += "<td>" + elem.lastName + "</td>";
                temp += "<td>" + elem.age + "</td>";
                temp += "<td>" + elem.email + "</td>";
                temp += "<td>" + elem.roles + "</td>";
                temp += "<td><button type='button' data-toggle='modal' " +
                    "class='btn btn-primary btn-sm text-white btn-info' data-target='#editModal"+ elem.id+"'>Edit</button></td>";
                temp += "<td><form class='delete_form' method='DELETE' action='/admin/users/{id}(id = " + elem.id+ ")'>" +
                    "<button type='submit' class='btn btn-primary btn-sm btn-danger'>Delete</button></form></td>";
                temp += "</tr>";
            })
            document.querySelector(".tbody").innerHTML += temp
        })
        .catch((err) => {
            console.error(err);
        });
})