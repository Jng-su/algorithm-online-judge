process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const input = data.split(" ");
    const n = Number(input[0]);
    const m = Number(input[1]);

    for (r=0; r<m; r++){
        let result_row = '';
        for (c=0; c<n; c++){
            result_row += '*';
        }
        console.log(result_row);
    }
});
