async function fetchData(){
    const records = await fetch("http://localhost:8080/customer");
    const data = records.json();

    let tab = ''

    data.forEach(item => function(user){
        console.log(item.id)
        tab += `<tr>
        <td>${item.firstName}</td>
        <td>${item.lastName}</td>
        <td>${item.id}</td>
        </tr>`;
    })

    document.getElementById('data-table-body').innerHTML = tab;
}

fetchData();

