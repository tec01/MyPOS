insert into EMPLOYEES (EMPLOYEE_ID, NAME) values (1, 'admin');
insert into FAMILIES (FAMILY_ID, NAME) values
(1,'Alcohol free drinks'),
(2,'Beers & Liquors'),
(3,'Wines'),
(4,'Pizzas'),
(5,'Fried'),
(6,'Salads'),
(7,'Pastas'),
(8,'Chips'),
(9,'Cookies & others');
insert into PRODUCTS (PRODUCT_ID, DATE_CREATED,NAME,DESCRIPTION,FAMILY_ID, PRICE, CATEGORY ,PRODUCT_TYPE) values
(1, now(), 'Coke', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque', 1, 1, 'UNIT', 'RESALE'),
(2, now(), 'Fanta','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque', 1, 1, 'UNIT', 'RESALE'),
(3, now(), 'Aquarius', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque', 1, 1, 'UNIT', 'RESALE'),
(4, now(), 'Org. Aquarius', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  1, 1, 'UNIT', 'RESALE'),
(5, now(), '7up', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque', 1, 1, 'UNIT', 'RESALE'),
(6, now(), 'Pepsi', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  1, 1, 'UNIT', 'RESALE'),
(7, now(), 'Beer1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  2, 2.5, 'UNIT', 'RESALE'),
(8, now(), 'Beer2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  2, 2.5, 'UNIT', 'RESALE'),
(9, now(), 'Beer3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  2, 2.5, 'UNIT', 'RESALE'),
(10, now(), 'Beer4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  2, 2.5, 'UNIT', 'RESALE'),
(11, now(), 'Limonchello', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  2, 6, 'UNIT', 'RESALE'),
(12, now(), 'Wine1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  3, 4.5, 'UNIT', 'RESALE'),
(13, now(), 'Wine2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  3, 4.5, 'UNIT', 'RESALE'),
(14, now(), 'Wine3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  3, 4.5, 'UNIT', 'RESALE'),
(15, now(), 'Wine4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  3, 4.5, 'UNIT', 'RESALE'),
(16, now(), 'Calabrese', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  4, 10, 'UNIT', 'ELABORATED'),
(17, now(), 'Diavola', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  4, 10, 'UNIT', 'ELABORATED'),
(18, now(), 'Margherita', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  4, 10, 'UNIT', 'ELABORATED'),
(19, now(), 'Capricciosa', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  4, 10, 'UNIT', 'ELABORATED'),
(20, now(), '4Formaggi', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  4, 10, 'UNIT', 'ELABORATED'),
(21, now(), 'Fried fish', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  5, 5, 1, 'ELABORATED'),
(22, now(), 'French fries', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  5, 2, 1, 'ELABORATED'),
(23, now(), 'Fried chicken', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  5, 5, 1, 'ELABORATED'),
(24, now(), 'Salad 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  6, 1.5, 'UNIT', 'ELABORATED'),
(25, now(), 'Salad 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  6, 1.5, 'UNIT', 'MODIFIED'),
(26, now(), 'Salad 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  6, 1.5, 'UNIT', 'MODIFIED'),
(27, now(), 'Pastas 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  7, 4, 'BULK', 'ELABORATED'),
(28, now(), 'Pastas 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  7, 4, 'BULK', 'ELABORATED'),
(29, now(), 'Pastas 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  7, 2.5, 'UNIT', 'RESALE'),
(30, now(), 'Pastas 4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  7, 2.5, 'UNIT', 'RESALE'),
(31, now(), 'Pastas 5', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  7, 3.5, 'UNIT', 'RESALE'),
(32, now(), 'Chips 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  8, 1.8, 'UNIT', 'RESALE'),
(33, now(), 'Chips 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  8, 1.9, 'UNIT', 'RESALE'),
(34, now(), 'Chips 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  8, 1.9, 'UNIT', 'RESALE'),
(35, now(), 'Chips 4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  8, 2, 'UNIT', 'RESALE'),
(36, now(), 'Cookies 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  9, 4, 'UNIT', 'RESALE'),
(37, now(), 'Cookies 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  9, 4, 'UNIT', 'RESALE'),
(38, now(), 'Cookies 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  9, 4.5, 'UNIT', 'RESALE'),
(39, now(), 'Cookies 4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  9, 4.9, 'UNIT', 'RESALE'),
(40, now(), 'Cookies 5', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam id sagittis nisl. Integer efficitur purus at eros venenatis feugiat. Aenean rutrum gravida magna id varius. Integer suscipit, libero condimentum placerat feugiat, turpis sapien semper urna, vehicula tempor dui quam tincidunt dolor. Nulla sapien massa, sagittis et velit non, luctus malesuada eros. Quisque et eros porttitor, efficitur risus sed, varius urna. Morbi ornare, nunc et gravida sagittis, ex nibh laoreet sem, ac rutrum nisi libero et orci. Nunc scelerisque, justo eu tincidunt ultrices, sem erat efficitur libero, non iaculis enim neque nec neque',  9, 5, 'UNIT', 'RESALE');



