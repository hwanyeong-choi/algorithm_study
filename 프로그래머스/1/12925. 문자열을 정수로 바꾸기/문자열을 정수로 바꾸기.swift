func solution(_ s:String) -> Int {
    
   var result: Int = 0
    var temp: String = ""

    if s[s.index(s.startIndex, offsetBy: 0)] == "-"
    {  
        for i in 1..<s.count
        {
            temp.append(s[s.index(s.startIndex, offsetBy: i)])
        }
        result = Int(temp)! * -1
    }
    else
    {
        for i in 0..<s.count
        {
            temp.append(s[s.index(s.startIndex, offsetBy: i)])
        }
        result = Int(temp)!

    }
    return result
}