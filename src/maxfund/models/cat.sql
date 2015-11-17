-- name: find-cat-by-id
select * from cats
where id = :maxfund-id
limit 1

