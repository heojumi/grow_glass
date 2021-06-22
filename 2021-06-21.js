function solution(numbers, hand) {
    var answer = '';
    var l_length=0
    var right=12
    var left=10
    for(var i=0;i<numbers.length;i++){
        if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
            answer+='L'
            left=numbers[i]

        }
        else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
            right=numbers[i]
            answer+='R'
            var r_length=0
        }
        else{
            if(numbers[i]==0)
                numbers[i]=11

            if(left==2||left==5||left==8||left==11)
                l_length=(numbers[i]-left)/3
            else{
                l_length=(numbers[i]-left-1)/3
                if(l_length<0)
                    l_length=-l_length+1
                else
                    l_length=l_length+1
            }

            if(right==2||right==5||right==8||right==11)
                r_length=(numbers[i]-right)/3
            else
             {   r_length=(numbers[i]-right+1)/3
                if(r_length<0)
                    r_length=-r_length+1
                else
                    r_length=r_length+1
             }

            if(l_length<0)
                l_length=-l_length
            if(r_length<0)
                r_length=-r_length
            if(l_length>r_length){
                answer+='R'
                right=numbers[i]
                r_length=0
                l_length=0
            }
            else if(l_length<r_length){
                answer+='L'
                left=numbers[i]
                l_length=0
                r_length=0

            }
            else if(l_length==r_length){
                if(hand=="right"){
                    right=numbers[i]
                    answer+='R'
                    r_length=0
                    l_length=0

                }
                else if(hand=="left"){
                    left=numbers[i]
                    answer+='L'
                    l_length=0
                    r_length=0
                                    }
            }
            }
}

    return answer;
}

