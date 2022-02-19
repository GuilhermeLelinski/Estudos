--questão 1
maioresMenores :: Ord a => [a] -> a -> ([a],[a])
maioresMenores [] _ = ([],[])
maioresMenores (x:xs) d | x < d = (x:z, b)
                        | otherwise = (z, x:b)
  where (z, b) = maioresMenores xs d

--questão 2
marcar :: [Char] -> Char -> [Char]
marcar [] c = []
marcar (x:xs) c = if x == c then '*':marcar xs c else x:marcar xs c
                


--questão 3
inserir :: Ord a => a -> [a] -> [a]
inserir n [] = [n]
inserir n (x:xs) = if (n < x) then n:x:xs else x:(inserir n xs)  


--questão 4
intercalacao :: Ord a => [a] -> [a] -> [a]
intercalacao xs [] = xs
intercalacao [] ys = ys
intercalacao (x:xs) (y:ys) | x < y = x:intercalacao xs (y:ys)
                           | otherwise = y:intercalacao ys (x:xs)


--questão 5
{-
contaPalavras :: (Num a ) => [Char] -> a
contaPalavras -}

contaPalavras :: String -> Int 
contaPalavras p = sum $ map (length . words) (lines p)
  

--questão 6
data Arvore a = Galho a (Arvore a) (Arvore a) 
              | Folha 
              deriving Show


mapArv :: (a -> b) -> Arvore a -> Arvore b 

mapArv funcao (Folha) = Folha
mapArv funcao (Galho x left right) = Galho (funcao x) (mapArv funcao left) (mapArv funcao right)
