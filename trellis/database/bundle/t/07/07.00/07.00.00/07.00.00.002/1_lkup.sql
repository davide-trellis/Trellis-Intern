--TRE-16863 Create new TAB for Notes and associate with all contracts.

INSERT INTO GTS.lkup (lkup_id, lkup_typ_id, shrt_nm, dsc, seq_nbr, actv_ind, edi_mapping_cd, crt_dt, crt_usr, upd_dt, upd_usr, crt_usr_id, upd_usr_id)
select 318931, 318900, 'Notes', 'Contract tab for external notes', 31, 1, null, sysdate, 'admin', sysdate, 'admin', 1, 1 
from dual 
where not exists (select 'x' from gts.lkup where lkup_id = 318931);
