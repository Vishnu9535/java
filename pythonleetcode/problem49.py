    # public List<List<String>> groupAnagrams(String[] strs) {
    #     // List<List<String>> res = new ArrayList<>();
    #     HashMap<String, List<String>> map = new HashMap<>();
    #     for (String str : strs) {
    #         char[] temp = str.toCharArray();
    #         Arrays.sort(temp);
    #         String x = new String(temp);
    #         if(!map.containsKey(x)){
    #             map.put(x,new ArrayList<>());
    #         }
    #         map.get(x).add(str);
    #     }
    #     System.out.println(map.toString());
    #     List<List<String>> res = new ArrayList<>(map.values());
    #         return res;
def groupAnagrams(arr):
    a =dict()
    for i in arr:
        x= ''.join(sorted(i))
        if x in a:
            a[x].append(i)
        else:
            a[x] = [i]
    final = list(a.values())
    print(final)
    z=0 
   

arr=["eat","tea","tan","ate","nat","bat"]
# groupAnagrams(arr)
b=20
a= 30
while b:
    a,b= b,a%b
print(a)
print(20%10)

