const get_api_res_btn = document.getElementById('get_api_res_btn');
const api_result1 = document.getElementById('api_result1');
const api_result2 = document.getElementById('api_result2');
const api_result3 = document.getElementById('api_result3');
get_api_res_btn.addEventListener('click', getAPI);
const input1 = document.getElementById("api_result");

    function getAPI(){
        let endPoint = 'https://www.omdbapi.com/?apikey=8f4751af&t=' + input1.value;
        fetch(endPoint, {
    method: 'GET'
  })
    .then(res => res.json())
    .then(data=> {
        api_result1.innerHTML += data.Title;
        api_result2.innerHTML += data.Year;
        api_result3.innerHTML += data.Director;
    });
    }