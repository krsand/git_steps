#  There are following steps for GIT

first I will write steps here
then I will show it via command and tell you what is happening 

(Mostly there won't be questing from git in interviews)
they will just check if you know it or not
if you simply mention these steps it will be enough


# Setting up git for the first time 

## First We need to create a repo in github using webpage and find it's url
- Sample URL : https://github.com/krsand/git_steps.git

- Then create a folder with same name on your laptop
- Then go to the directory
- Create your files
- save your changes
-
### Now initialize git repo locally

``` shell
    git init
```

### Save your local change (now I am going to same it)
### Then do git add . to add everyting to local repository
``` shell
    git add .
```
Now every  thing is saved locally
now I need to commit everything

```shell
    git commit -m "first commit"
```
so all changes are commited now

### Now link local repo with remote repo 
-- NOTE: this is one time step. THis is done only when you are initializing repo from your local
which we don't do usually
mostly we get repo link directly from team

command
``` shell
    git remote add origin https://github.com/krsand/git_steps.git
```

now it is linked. so we can push code to remote repo

command 
``` shell
 git push --set-upstream origin master
```
so it is done. we can see everything in github webpage now


# Above steps are used only when we are initializing git on local, if we already have git repo in that case we flollow following steps


1. Clone or Pull code from repo
 
 Clone Command (if you don't have repo locally)
 ```shell 
    git clone https://github.com/krsand/git_steps.git
 ```
 Pull Command (if you already have repo locally but need to pull code from remote )
```shell
     git clone https://github.com/krsand/git_steps.git
```
    
2. Create new branch
```shell
    git checkout -b "new_branch"
```
3. Make required changes in repo
4. Add those changes to repo 
```shell
    git add . 
```
5. Commit all the changes 
```shell
    git commit -m "give brief intro of the changes you have done"
```
6. Push the code

``` shell
    git push --set-upstream origin new_branch
```
this step will give one url for example

7. Thn create PR
