import React from 'react';
import './App.css';
import 'typeface-roboto';
import { makeStyles } from '@material-ui/core/styles';
import { AppBar, Drawer, List, ListItem, Toolbar, ListItemText, Typography, Button, ListItemIcon, Divider } from '@material-ui/core';
import ExerciseCenterIcon from '@material-ui/icons/FitnessCenter';
import AssignmentIcon from '@material-ui/icons/Assignment';
import PersonIcon from '@material-ui/icons/Person';

const drawerWidth = 240;

const useStyles = makeStyles((theme) => ({
  root: {
    display: 'flex',
  },
  appBar: {
    zIndex: theme.zIndex.drawer + 1,
  },
  title: {
    flexGrow: 1,
  },
  drawer: {
    width: drawerWidth,
    flexShrink: 0,
  },
  drawerPaper: {
    width: drawerWidth,
  },
  drawerContainer: {
    overflow: 'auto',
  },
  content: {
    flexGrow: 1,
    padding: theme.spacing(3),
  },
}));

function App() {
  const classes = useStyles();

  return (
    <div>
      <AppBar position='fixed' className={classes.appBar}>
        <Toolbar>
          <Typography variant="h6" className={classes.title}>
            Exercise Clinic
          </Typography>
          <Button color='inherit'>Login</Button>
        </Toolbar>
      </AppBar>
      <Drawer
        className={classes.drawer}
        variant="permanent"
        classes={{
          paper: classes.drawerPaper,
        }}
      >
        <Toolbar />
         <div className={classes.drawerContainer}></div>
          <List>
            <ListItem button key="exercises"> 
              <ListItemIcon>
                <ExerciseCenterIcon />
              </ListItemIcon>
              <ListItemText>Exercises</ListItemText>
            </ListItem>
            <ListItem button key="plans"> 
              <ListItemIcon>
                <AssignmentIcon />
              </ListItemIcon>
              <ListItemText>Plans</ListItemText>
            </ListItem>
            <Divider />
            <ListItem button key="clients"> 
              <ListItemIcon>
                <PersonIcon />
              </ListItemIcon>
              <ListItemText>Clients</ListItemText>
            </ListItem>
          </List>

        </Drawer>
      </div>
  );
}

export default App;
