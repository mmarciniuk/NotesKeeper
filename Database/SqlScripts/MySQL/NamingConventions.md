# Naming convention

|Object                 |Notation  |Length|Plural|Prefix|Suffix|Char Mask  |Example                  |
|-----------------------|----------|------|------|------|------|-----------|-------------------------|
|Schema                 |lowercase |30    |No    |No    |No    |[A-z][0-9] |my_schema                |
|Table                  |lowercase |50    |No    |No    |No    |[A-z][0-9] |my_table                 |
|Column                 |PascalCase|100   |No    |No    |No    |[A-z][0-9] |MyColumn                 |
|Constraint Unique Index|PascalCase|100   |No    |IX_   |No    |[A-z][0-9] |IX_MyConstrainUniqueIndex|
|Constraint Unique      |PascalCase|100   |No    |UQ_   |No    |[A-z][0-9] |UQ_MyConstrainUnique     |
|Table Primary Key      |PascalCase|100   |No    |PK_   |No    |[A-z][0-9] |PK_MyTableID             |
|Table Foreign Key      |PascalCase|100   |No    |FK_   |No    |[A-z][0-9] |FK_ColumnIdMyTable       |
