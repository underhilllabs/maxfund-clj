-- name: find-cat-by-id
select * from cat_dms
where id = :maxfund-id
limit 1

-- name: find-all-cats
select * from cat_dms

-- name: find-all-alumni-cats
select * from cat_dms
where is_current=0
order by loc ASC

--name: find-all-current-cats
select * from cat_dms
where is_current=1
order by loc ASC


