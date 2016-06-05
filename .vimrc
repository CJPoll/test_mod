set smartindent
set autoindent
set tabstop=4
set shiftwidth=4
set noexpandtab

set path=$PWD/src/**
set wildignore+=*.so,*.swp,*.class,build

let g:ctrlp_map = '<C-p>'
let g:ctrlp_custom_ignore = {
      \ 'dir': '\.git|build',
      \}

nnoremap <localleader>i :JavaImport<cr>
nnoremap <leader>d :JavaDocSearch -x declarations<cr>
nnoremap <cr> :JavaSearchContext<cr>
