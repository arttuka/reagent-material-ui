{:foreign-libs
 ({:file "material-ui/material-ui.inc.js",
   :file-min "material-ui/material-ui.min.inc.js",
   :provides
   ["@material-ui/core"
    "@material-ui/core/styles"
    "@material-ui/core/utils"],
   :global-exports
   {"@material-ui/core" MaterialUI,
    "@material-ui/core/styles" MaterialUI,
    "@material-ui/core/utils" MaterialUI},
   :requires
   ["react" "react-dom" "@material-ui/styles" "@material-ui/utils"]}
  {:file "material-ui/material-ui-lab.inc.js",
   :file-min "material-ui/material-ui-lab.min.inc.js",
   :provides ["@material-ui/lab"],
   :global-exports {"@material-ui/lab" MaterialUILab},
   :requires
   ["react" "react-dom" "@material-ui/core" "@material-ui/utils"]}
  {:file "material-ui/material-ui-styles.inc.js",
   :file-min "material-ui/material-ui-styles.min.inc.js",
   :provides ["@material-ui/styles"],
   :global-exports {"@material-ui/styles" MaterialUIStyles},
   :requires ["react" "react-dom" "@material-ui/utils"]}
  {:file "material-ui/material-ui-utils.inc.js",
   :file-min "material-ui/material-ui-utils.min.inc.js",
   :provides ["@material-ui/utils"],
   :global-exports {"@material-ui/utils" MaterialUIUtils},
   :requires ["react" "react-dom"]}
  {:file "material-ui/material-ui-accordion.inc.js",
   :file-min "material-ui/material-ui-accordion.min.inc.js",
   :provides ["@material-ui/core/Accordion"],
   :global-exports {"@material-ui/core/Accordion" MaterialUIAccordion},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-accordion-actions.inc.js",
   :file-min "material-ui/material-ui-accordion-actions.min.inc.js",
   :provides ["@material-ui/core/AccordionActions"],
   :global-exports
   {"@material-ui/core/AccordionActions" MaterialUIAccordionActions},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-accordion-details.inc.js",
   :file-min "material-ui/material-ui-accordion-details.min.inc.js",
   :provides ["@material-ui/core/AccordionDetails"],
   :global-exports
   {"@material-ui/core/AccordionDetails" MaterialUIAccordionDetails},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-accordion-summary.inc.js",
   :file-min "material-ui/material-ui-accordion-summary.min.inc.js",
   :provides ["@material-ui/core/AccordionSummary"],
   :global-exports
   {"@material-ui/core/AccordionSummary" MaterialUIAccordionSummary},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-alert.inc.js",
   :file-min "material-ui/material-ui-alert.min.inc.js",
   :provides ["@material-ui/core/Alert"],
   :global-exports {"@material-ui/core/Alert" MaterialUIAlert},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-alert-title.inc.js",
   :file-min "material-ui/material-ui-alert-title.min.inc.js",
   :provides ["@material-ui/core/AlertTitle"],
   :global-exports
   {"@material-ui/core/AlertTitle" MaterialUIAlertTitle},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-app-bar.inc.js",
   :file-min "material-ui/material-ui-app-bar.min.inc.js",
   :provides ["@material-ui/core/AppBar"],
   :global-exports {"@material-ui/core/AppBar" MaterialUIAppBar},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-autocomplete.inc.js",
   :file-min "material-ui/material-ui-autocomplete.min.inc.js",
   :provides ["@material-ui/core/Autocomplete"],
   :global-exports
   {"@material-ui/core/Autocomplete" MaterialUIAutocomplete},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-avatar.inc.js",
   :file-min "material-ui/material-ui-avatar.min.inc.js",
   :provides ["@material-ui/core/Avatar"],
   :global-exports {"@material-ui/core/Avatar" MaterialUIAvatar},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-avatar-group.inc.js",
   :file-min "material-ui/material-ui-avatar-group.min.inc.js",
   :provides ["@material-ui/core/AvatarGroup"],
   :global-exports
   {"@material-ui/core/AvatarGroup" MaterialUIAvatarGroup},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-backdrop.inc.js",
   :file-min "material-ui/material-ui-backdrop.min.inc.js",
   :provides ["@material-ui/core/Backdrop"],
   :global-exports {"@material-ui/core/Backdrop" MaterialUIBackdrop},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-badge.inc.js",
   :file-min "material-ui/material-ui-badge.min.inc.js",
   :provides ["@material-ui/core/Badge"],
   :global-exports {"@material-ui/core/Badge" MaterialUIBadge},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-bottom-navigation.inc.js",
   :file-min "material-ui/material-ui-bottom-navigation.min.inc.js",
   :provides ["@material-ui/core/BottomNavigation"],
   :global-exports
   {"@material-ui/core/BottomNavigation" MaterialUIBottomNavigation},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-bottom-navigation-action.inc.js",
   :file-min
   "material-ui/material-ui-bottom-navigation-action.min.inc.js",
   :provides ["@material-ui/core/BottomNavigationAction"],
   :global-exports
   {"@material-ui/core/BottomNavigationAction"
    MaterialUIBottomNavigationAction},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-box.inc.js",
   :file-min "material-ui/material-ui-box.min.inc.js",
   :provides ["@material-ui/core/Box"],
   :global-exports {"@material-ui/core/Box" MaterialUIBox},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-breadcrumbs.inc.js",
   :file-min "material-ui/material-ui-breadcrumbs.min.inc.js",
   :provides ["@material-ui/core/Breadcrumbs"],
   :global-exports
   {"@material-ui/core/Breadcrumbs" MaterialUIBreadcrumbs},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-button.inc.js",
   :file-min "material-ui/material-ui-button.min.inc.js",
   :provides ["@material-ui/core/Button"],
   :global-exports {"@material-ui/core/Button" MaterialUIButton},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-button-base.inc.js",
   :file-min "material-ui/material-ui-button-base.min.inc.js",
   :provides ["@material-ui/core/ButtonBase"],
   :global-exports
   {"@material-ui/core/ButtonBase" MaterialUIButtonBase},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-button-group.inc.js",
   :file-min "material-ui/material-ui-button-group.min.inc.js",
   :provides ["@material-ui/core/ButtonGroup"],
   :global-exports
   {"@material-ui/core/ButtonGroup" MaterialUIButtonGroup},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-card.inc.js",
   :file-min "material-ui/material-ui-card.min.inc.js",
   :provides ["@material-ui/core/Card"],
   :global-exports {"@material-ui/core/Card" MaterialUICard},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-card-action-area.inc.js",
   :file-min "material-ui/material-ui-card-action-area.min.inc.js",
   :provides ["@material-ui/core/CardActionArea"],
   :global-exports
   {"@material-ui/core/CardActionArea" MaterialUICardActionArea},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-card-actions.inc.js",
   :file-min "material-ui/material-ui-card-actions.min.inc.js",
   :provides ["@material-ui/core/CardActions"],
   :global-exports
   {"@material-ui/core/CardActions" MaterialUICardActions},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-card-content.inc.js",
   :file-min "material-ui/material-ui-card-content.min.inc.js",
   :provides ["@material-ui/core/CardContent"],
   :global-exports
   {"@material-ui/core/CardContent" MaterialUICardContent},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-card-header.inc.js",
   :file-min "material-ui/material-ui-card-header.min.inc.js",
   :provides ["@material-ui/core/CardHeader"],
   :global-exports
   {"@material-ui/core/CardHeader" MaterialUICardHeader},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-card-media.inc.js",
   :file-min "material-ui/material-ui-card-media.min.inc.js",
   :provides ["@material-ui/core/CardMedia"],
   :global-exports {"@material-ui/core/CardMedia" MaterialUICardMedia},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-checkbox.inc.js",
   :file-min "material-ui/material-ui-checkbox.min.inc.js",
   :provides ["@material-ui/core/Checkbox"],
   :global-exports {"@material-ui/core/Checkbox" MaterialUICheckbox},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-chip.inc.js",
   :file-min "material-ui/material-ui-chip.min.inc.js",
   :provides ["@material-ui/core/Chip"],
   :global-exports {"@material-ui/core/Chip" MaterialUIChip},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-circular-progress.inc.js",
   :file-min "material-ui/material-ui-circular-progress.min.inc.js",
   :provides ["@material-ui/core/CircularProgress"],
   :global-exports
   {"@material-ui/core/CircularProgress" MaterialUICircularProgress},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-click-away-listener.inc.js",
   :file-min "material-ui/material-ui-click-away-listener.min.inc.js",
   :provides ["@material-ui/core/ClickAwayListener"],
   :global-exports
   {"@material-ui/core/ClickAwayListener" MaterialUIClickAwayListener},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-collapse.inc.js",
   :file-min "material-ui/material-ui-collapse.min.inc.js",
   :provides ["@material-ui/core/Collapse"],
   :global-exports {"@material-ui/core/Collapse" MaterialUICollapse},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-container.inc.js",
   :file-min "material-ui/material-ui-container.min.inc.js",
   :provides ["@material-ui/core/Container"],
   :global-exports {"@material-ui/core/Container" MaterialUIContainer},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-css-baseline.inc.js",
   :file-min "material-ui/material-ui-css-baseline.min.inc.js",
   :provides ["@material-ui/core/CssBaseline"],
   :global-exports
   {"@material-ui/core/CssBaseline" MaterialUICssBaseline},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-dialog.inc.js",
   :file-min "material-ui/material-ui-dialog.min.inc.js",
   :provides ["@material-ui/core/Dialog"],
   :global-exports {"@material-ui/core/Dialog" MaterialUIDialog},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-dialog-actions.inc.js",
   :file-min "material-ui/material-ui-dialog-actions.min.inc.js",
   :provides ["@material-ui/core/DialogActions"],
   :global-exports
   {"@material-ui/core/DialogActions" MaterialUIDialogActions},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-dialog-content.inc.js",
   :file-min "material-ui/material-ui-dialog-content.min.inc.js",
   :provides ["@material-ui/core/DialogContent"],
   :global-exports
   {"@material-ui/core/DialogContent" MaterialUIDialogContent},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-dialog-content-text.inc.js",
   :file-min "material-ui/material-ui-dialog-content-text.min.inc.js",
   :provides ["@material-ui/core/DialogContentText"],
   :global-exports
   {"@material-ui/core/DialogContentText" MaterialUIDialogContentText},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-dialog-title.inc.js",
   :file-min "material-ui/material-ui-dialog-title.min.inc.js",
   :provides ["@material-ui/core/DialogTitle"],
   :global-exports
   {"@material-ui/core/DialogTitle" MaterialUIDialogTitle},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-divider.inc.js",
   :file-min "material-ui/material-ui-divider.min.inc.js",
   :provides ["@material-ui/core/Divider"],
   :global-exports {"@material-ui/core/Divider" MaterialUIDivider},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-drawer.inc.js",
   :file-min "material-ui/material-ui-drawer.min.inc.js",
   :provides ["@material-ui/core/Drawer"],
   :global-exports {"@material-ui/core/Drawer" MaterialUIDrawer},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-fab.inc.js",
   :file-min "material-ui/material-ui-fab.min.inc.js",
   :provides ["@material-ui/core/Fab"],
   :global-exports {"@material-ui/core/Fab" MaterialUIFab},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-fade.inc.js",
   :file-min "material-ui/material-ui-fade.min.inc.js",
   :provides ["@material-ui/core/Fade"],
   :global-exports {"@material-ui/core/Fade" MaterialUIFade},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-filled-input.inc.js",
   :file-min "material-ui/material-ui-filled-input.min.inc.js",
   :provides ["@material-ui/core/FilledInput"],
   :global-exports
   {"@material-ui/core/FilledInput" MaterialUIFilledInput},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-form-control.inc.js",
   :file-min "material-ui/material-ui-form-control.min.inc.js",
   :provides ["@material-ui/core/FormControl"],
   :global-exports
   {"@material-ui/core/FormControl" MaterialUIFormControl},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-form-control-label.inc.js",
   :file-min "material-ui/material-ui-form-control-label.min.inc.js",
   :provides ["@material-ui/core/FormControlLabel"],
   :global-exports
   {"@material-ui/core/FormControlLabel" MaterialUIFormControlLabel},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-form-group.inc.js",
   :file-min "material-ui/material-ui-form-group.min.inc.js",
   :provides ["@material-ui/core/FormGroup"],
   :global-exports {"@material-ui/core/FormGroup" MaterialUIFormGroup},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-form-helper-text.inc.js",
   :file-min "material-ui/material-ui-form-helper-text.min.inc.js",
   :provides ["@material-ui/core/FormHelperText"],
   :global-exports
   {"@material-ui/core/FormHelperText" MaterialUIFormHelperText},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-form-label.inc.js",
   :file-min "material-ui/material-ui-form-label.min.inc.js",
   :provides ["@material-ui/core/FormLabel"],
   :global-exports {"@material-ui/core/FormLabel" MaterialUIFormLabel},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-global-styles.inc.js",
   :file-min "material-ui/material-ui-global-styles.min.inc.js",
   :provides ["@material-ui/core/GlobalStyles"],
   :global-exports
   {"@material-ui/core/GlobalStyles" MaterialUIGlobalStyles},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-grid.inc.js",
   :file-min "material-ui/material-ui-grid.min.inc.js",
   :provides ["@material-ui/core/Grid"],
   :global-exports {"@material-ui/core/Grid" MaterialUIGrid},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-grow.inc.js",
   :file-min "material-ui/material-ui-grow.min.inc.js",
   :provides ["@material-ui/core/Grow"],
   :global-exports {"@material-ui/core/Grow" MaterialUIGrow},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-hidden.inc.js",
   :file-min "material-ui/material-ui-hidden.min.inc.js",
   :provides ["@material-ui/core/Hidden"],
   :global-exports {"@material-ui/core/Hidden" MaterialUIHidden},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-icon.inc.js",
   :file-min "material-ui/material-ui-icon.min.inc.js",
   :provides ["@material-ui/core/Icon"],
   :global-exports {"@material-ui/core/Icon" MaterialUIIcon},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-icon-button.inc.js",
   :file-min "material-ui/material-ui-icon-button.min.inc.js",
   :provides ["@material-ui/core/IconButton"],
   :global-exports
   {"@material-ui/core/IconButton" MaterialUIIconButton},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-image-list.inc.js",
   :file-min "material-ui/material-ui-image-list.min.inc.js",
   :provides ["@material-ui/core/ImageList"],
   :global-exports {"@material-ui/core/ImageList" MaterialUIImageList},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-image-list-item.inc.js",
   :file-min "material-ui/material-ui-image-list-item.min.inc.js",
   :provides ["@material-ui/core/ImageListItem"],
   :global-exports
   {"@material-ui/core/ImageListItem" MaterialUIImageListItem},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-image-list-item-bar.inc.js",
   :file-min "material-ui/material-ui-image-list-item-bar.min.inc.js",
   :provides ["@material-ui/core/ImageListItemBar"],
   :global-exports
   {"@material-ui/core/ImageListItemBar" MaterialUIImageListItemBar},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-input.inc.js",
   :file-min "material-ui/material-ui-input.min.inc.js",
   :provides ["@material-ui/core/Input"],
   :global-exports {"@material-ui/core/Input" MaterialUIInput},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-input-adornment.inc.js",
   :file-min "material-ui/material-ui-input-adornment.min.inc.js",
   :provides ["@material-ui/core/InputAdornment"],
   :global-exports
   {"@material-ui/core/InputAdornment" MaterialUIInputAdornment},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-input-base.inc.js",
   :file-min "material-ui/material-ui-input-base.min.inc.js",
   :provides ["@material-ui/core/InputBase"],
   :global-exports {"@material-ui/core/InputBase" MaterialUIInputBase},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-input-label.inc.js",
   :file-min "material-ui/material-ui-input-label.min.inc.js",
   :provides ["@material-ui/core/InputLabel"],
   :global-exports
   {"@material-ui/core/InputLabel" MaterialUIInputLabel},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-linear-progress.inc.js",
   :file-min "material-ui/material-ui-linear-progress.min.inc.js",
   :provides ["@material-ui/core/LinearProgress"],
   :global-exports
   {"@material-ui/core/LinearProgress" MaterialUILinearProgress},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-link.inc.js",
   :file-min "material-ui/material-ui-link.min.inc.js",
   :provides ["@material-ui/core/Link"],
   :global-exports {"@material-ui/core/Link" MaterialUILink},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list.inc.js",
   :file-min "material-ui/material-ui-list.min.inc.js",
   :provides ["@material-ui/core/List"],
   :global-exports {"@material-ui/core/List" MaterialUIList},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list-item.inc.js",
   :file-min "material-ui/material-ui-list-item.min.inc.js",
   :provides ["@material-ui/core/ListItem"],
   :global-exports {"@material-ui/core/ListItem" MaterialUIListItem},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list-item-avatar.inc.js",
   :file-min "material-ui/material-ui-list-item-avatar.min.inc.js",
   :provides ["@material-ui/core/ListItemAvatar"],
   :global-exports
   {"@material-ui/core/ListItemAvatar" MaterialUIListItemAvatar},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list-item-icon.inc.js",
   :file-min "material-ui/material-ui-list-item-icon.min.inc.js",
   :provides ["@material-ui/core/ListItemIcon"],
   :global-exports
   {"@material-ui/core/ListItemIcon" MaterialUIListItemIcon},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list-item-secondary-action.inc.js",
   :file-min
   "material-ui/material-ui-list-item-secondary-action.min.inc.js",
   :provides ["@material-ui/core/ListItemSecondaryAction"],
   :global-exports
   {"@material-ui/core/ListItemSecondaryAction"
    MaterialUIListItemSecondaryAction},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list-item-text.inc.js",
   :file-min "material-ui/material-ui-list-item-text.min.inc.js",
   :provides ["@material-ui/core/ListItemText"],
   :global-exports
   {"@material-ui/core/ListItemText" MaterialUIListItemText},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-list-subheader.inc.js",
   :file-min "material-ui/material-ui-list-subheader.min.inc.js",
   :provides ["@material-ui/core/ListSubheader"],
   :global-exports
   {"@material-ui/core/ListSubheader" MaterialUIListSubheader},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-menu.inc.js",
   :file-min "material-ui/material-ui-menu.min.inc.js",
   :provides ["@material-ui/core/Menu"],
   :global-exports {"@material-ui/core/Menu" MaterialUIMenu},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-menu-item.inc.js",
   :file-min "material-ui/material-ui-menu-item.min.inc.js",
   :provides ["@material-ui/core/MenuItem"],
   :global-exports {"@material-ui/core/MenuItem" MaterialUIMenuItem},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-menu-list.inc.js",
   :file-min "material-ui/material-ui-menu-list.min.inc.js",
   :provides ["@material-ui/core/MenuList"],
   :global-exports {"@material-ui/core/MenuList" MaterialUIMenuList},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-mobile-stepper.inc.js",
   :file-min "material-ui/material-ui-mobile-stepper.min.inc.js",
   :provides ["@material-ui/core/MobileStepper"],
   :global-exports
   {"@material-ui/core/MobileStepper" MaterialUIMobileStepper},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-modal.inc.js",
   :file-min "material-ui/material-ui-modal.min.inc.js",
   :provides ["@material-ui/core/Modal"],
   :global-exports {"@material-ui/core/Modal" MaterialUIModal},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-native-select.inc.js",
   :file-min "material-ui/material-ui-native-select.min.inc.js",
   :provides ["@material-ui/core/NativeSelect"],
   :global-exports
   {"@material-ui/core/NativeSelect" MaterialUINativeSelect},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-no-ssr.inc.js",
   :file-min "material-ui/material-ui-no-ssr.min.inc.js",
   :provides ["@material-ui/core/NoSsr"],
   :global-exports {"@material-ui/core/NoSsr" MaterialUINoSsr},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-outlined-input.inc.js",
   :file-min "material-ui/material-ui-outlined-input.min.inc.js",
   :provides ["@material-ui/core/OutlinedInput"],
   :global-exports
   {"@material-ui/core/OutlinedInput" MaterialUIOutlinedInput},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-pagination.inc.js",
   :file-min "material-ui/material-ui-pagination.min.inc.js",
   :provides ["@material-ui/core/Pagination"],
   :global-exports
   {"@material-ui/core/Pagination" MaterialUIPagination},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-pagination-item.inc.js",
   :file-min "material-ui/material-ui-pagination-item.min.inc.js",
   :provides ["@material-ui/core/PaginationItem"],
   :global-exports
   {"@material-ui/core/PaginationItem" MaterialUIPaginationItem},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-paper.inc.js",
   :file-min "material-ui/material-ui-paper.min.inc.js",
   :provides ["@material-ui/core/Paper"],
   :global-exports {"@material-ui/core/Paper" MaterialUIPaper},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-popover.inc.js",
   :file-min "material-ui/material-ui-popover.min.inc.js",
   :provides ["@material-ui/core/Popover"],
   :global-exports {"@material-ui/core/Popover" MaterialUIPopover},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-popper.inc.js",
   :file-min "material-ui/material-ui-popper.min.inc.js",
   :provides ["@material-ui/core/Popper"],
   :global-exports {"@material-ui/core/Popper" MaterialUIPopper},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-portal.inc.js",
   :file-min "material-ui/material-ui-portal.min.inc.js",
   :provides ["@material-ui/core/Portal"],
   :global-exports {"@material-ui/core/Portal" MaterialUIPortal},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-radio.inc.js",
   :file-min "material-ui/material-ui-radio.min.inc.js",
   :provides ["@material-ui/core/Radio"],
   :global-exports {"@material-ui/core/Radio" MaterialUIRadio},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-radio-group.inc.js",
   :file-min "material-ui/material-ui-radio-group.min.inc.js",
   :provides ["@material-ui/core/RadioGroup"],
   :global-exports
   {"@material-ui/core/RadioGroup" MaterialUIRadioGroup},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-rating.inc.js",
   :file-min "material-ui/material-ui-rating.min.inc.js",
   :provides ["@material-ui/core/Rating"],
   :global-exports {"@material-ui/core/Rating" MaterialUIRating},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-scoped-css-baseline.inc.js",
   :file-min "material-ui/material-ui-scoped-css-baseline.min.inc.js",
   :provides ["@material-ui/core/ScopedCssBaseline"],
   :global-exports
   {"@material-ui/core/ScopedCssBaseline" MaterialUIScopedCssBaseline},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-select.inc.js",
   :file-min "material-ui/material-ui-select.min.inc.js",
   :provides ["@material-ui/core/Select"],
   :global-exports {"@material-ui/core/Select" MaterialUISelect},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-skeleton.inc.js",
   :file-min "material-ui/material-ui-skeleton.min.inc.js",
   :provides ["@material-ui/core/Skeleton"],
   :global-exports {"@material-ui/core/Skeleton" MaterialUISkeleton},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-slide.inc.js",
   :file-min "material-ui/material-ui-slide.min.inc.js",
   :provides ["@material-ui/core/Slide"],
   :global-exports {"@material-ui/core/Slide" MaterialUISlide},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-slider.inc.js",
   :file-min "material-ui/material-ui-slider.min.inc.js",
   :provides ["@material-ui/core/Slider"],
   :global-exports {"@material-ui/core/Slider" MaterialUISlider},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-snackbar.inc.js",
   :file-min "material-ui/material-ui-snackbar.min.inc.js",
   :provides ["@material-ui/core/Snackbar"],
   :global-exports {"@material-ui/core/Snackbar" MaterialUISnackbar},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-snackbar-content.inc.js",
   :file-min "material-ui/material-ui-snackbar-content.min.inc.js",
   :provides ["@material-ui/core/SnackbarContent"],
   :global-exports
   {"@material-ui/core/SnackbarContent" MaterialUISnackbarContent},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-speed-dial.inc.js",
   :file-min "material-ui/material-ui-speed-dial.min.inc.js",
   :provides ["@material-ui/core/SpeedDial"],
   :global-exports {"@material-ui/core/SpeedDial" MaterialUISpeedDial},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-speed-dial-action.inc.js",
   :file-min "material-ui/material-ui-speed-dial-action.min.inc.js",
   :provides ["@material-ui/core/SpeedDialAction"],
   :global-exports
   {"@material-ui/core/SpeedDialAction" MaterialUISpeedDialAction},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-speed-dial-icon.inc.js",
   :file-min "material-ui/material-ui-speed-dial-icon.min.inc.js",
   :provides ["@material-ui/core/SpeedDialIcon"],
   :global-exports
   {"@material-ui/core/SpeedDialIcon" MaterialUISpeedDialIcon},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-step.inc.js",
   :file-min "material-ui/material-ui-step.min.inc.js",
   :provides ["@material-ui/core/Step"],
   :global-exports {"@material-ui/core/Step" MaterialUIStep},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-step-button.inc.js",
   :file-min "material-ui/material-ui-step-button.min.inc.js",
   :provides ["@material-ui/core/StepButton"],
   :global-exports
   {"@material-ui/core/StepButton" MaterialUIStepButton},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-step-connector.inc.js",
   :file-min "material-ui/material-ui-step-connector.min.inc.js",
   :provides ["@material-ui/core/StepConnector"],
   :global-exports
   {"@material-ui/core/StepConnector" MaterialUIStepConnector},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-step-content.inc.js",
   :file-min "material-ui/material-ui-step-content.min.inc.js",
   :provides ["@material-ui/core/StepContent"],
   :global-exports
   {"@material-ui/core/StepContent" MaterialUIStepContent},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-step-icon.inc.js",
   :file-min "material-ui/material-ui-step-icon.min.inc.js",
   :provides ["@material-ui/core/StepIcon"],
   :global-exports {"@material-ui/core/StepIcon" MaterialUIStepIcon},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-step-label.inc.js",
   :file-min "material-ui/material-ui-step-label.min.inc.js",
   :provides ["@material-ui/core/StepLabel"],
   :global-exports {"@material-ui/core/StepLabel" MaterialUIStepLabel},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-stepper.inc.js",
   :file-min "material-ui/material-ui-stepper.min.inc.js",
   :provides ["@material-ui/core/Stepper"],
   :global-exports {"@material-ui/core/Stepper" MaterialUIStepper},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-styled-engine-provider.inc.js",
   :file-min
   "material-ui/material-ui-styled-engine-provider.min.inc.js",
   :provides ["@material-ui/core/StyledEngineProvider"],
   :global-exports
   {"@material-ui/core/StyledEngineProvider"
    MaterialUIStyledEngineProvider},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-svg-icon.inc.js",
   :file-min "material-ui/material-ui-svg-icon.min.inc.js",
   :provides ["@material-ui/core/SvgIcon"],
   :global-exports {"@material-ui/core/SvgIcon" MaterialUISvgIcon},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-swipeable-drawer.inc.js",
   :file-min "material-ui/material-ui-swipeable-drawer.min.inc.js",
   :provides ["@material-ui/core/SwipeableDrawer"],
   :global-exports
   {"@material-ui/core/SwipeableDrawer" MaterialUISwipeableDrawer},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-switch.inc.js",
   :file-min "material-ui/material-ui-switch.min.inc.js",
   :provides ["@material-ui/core/Switch"],
   :global-exports {"@material-ui/core/Switch" MaterialUISwitch},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-tab.inc.js",
   :file-min "material-ui/material-ui-tab.min.inc.js",
   :provides ["@material-ui/core/Tab"],
   :global-exports {"@material-ui/core/Tab" MaterialUITab},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-tab-scroll-button.inc.js",
   :file-min "material-ui/material-ui-tab-scroll-button.min.inc.js",
   :provides ["@material-ui/core/TabScrollButton"],
   :global-exports
   {"@material-ui/core/TabScrollButton" MaterialUITabScrollButton},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table.inc.js",
   :file-min "material-ui/material-ui-table.min.inc.js",
   :provides ["@material-ui/core/Table"],
   :global-exports {"@material-ui/core/Table" MaterialUITable},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-body.inc.js",
   :file-min "material-ui/material-ui-table-body.min.inc.js",
   :provides ["@material-ui/core/TableBody"],
   :global-exports {"@material-ui/core/TableBody" MaterialUITableBody},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-cell.inc.js",
   :file-min "material-ui/material-ui-table-cell.min.inc.js",
   :provides ["@material-ui/core/TableCell"],
   :global-exports {"@material-ui/core/TableCell" MaterialUITableCell},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-container.inc.js",
   :file-min "material-ui/material-ui-table-container.min.inc.js",
   :provides ["@material-ui/core/TableContainer"],
   :global-exports
   {"@material-ui/core/TableContainer" MaterialUITableContainer},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-footer.inc.js",
   :file-min "material-ui/material-ui-table-footer.min.inc.js",
   :provides ["@material-ui/core/TableFooter"],
   :global-exports
   {"@material-ui/core/TableFooter" MaterialUITableFooter},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-head.inc.js",
   :file-min "material-ui/material-ui-table-head.min.inc.js",
   :provides ["@material-ui/core/TableHead"],
   :global-exports {"@material-ui/core/TableHead" MaterialUITableHead},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-pagination.inc.js",
   :file-min "material-ui/material-ui-table-pagination.min.inc.js",
   :provides ["@material-ui/core/TablePagination"],
   :global-exports
   {"@material-ui/core/TablePagination" MaterialUITablePagination},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-row.inc.js",
   :file-min "material-ui/material-ui-table-row.min.inc.js",
   :provides ["@material-ui/core/TableRow"],
   :global-exports {"@material-ui/core/TableRow" MaterialUITableRow},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-table-sort-label.inc.js",
   :file-min "material-ui/material-ui-table-sort-label.min.inc.js",
   :provides ["@material-ui/core/TableSortLabel"],
   :global-exports
   {"@material-ui/core/TableSortLabel" MaterialUITableSortLabel},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-tabs.inc.js",
   :file-min "material-ui/material-ui-tabs.min.inc.js",
   :provides ["@material-ui/core/Tabs"],
   :global-exports {"@material-ui/core/Tabs" MaterialUITabs},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-text-field.inc.js",
   :file-min "material-ui/material-ui-text-field.min.inc.js",
   :provides ["@material-ui/core/TextField"],
   :global-exports {"@material-ui/core/TextField" MaterialUITextField},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-textarea-autosize.inc.js",
   :file-min "material-ui/material-ui-textarea-autosize.min.inc.js",
   :provides ["@material-ui/core/TextareaAutosize"],
   :global-exports
   {"@material-ui/core/TextareaAutosize" MaterialUITextareaAutosize},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-toggle-button.inc.js",
   :file-min "material-ui/material-ui-toggle-button.min.inc.js",
   :provides ["@material-ui/core/ToggleButton"],
   :global-exports
   {"@material-ui/core/ToggleButton" MaterialUIToggleButton},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-toggle-button-group.inc.js",
   :file-min "material-ui/material-ui-toggle-button-group.min.inc.js",
   :provides ["@material-ui/core/ToggleButtonGroup"],
   :global-exports
   {"@material-ui/core/ToggleButtonGroup" MaterialUIToggleButtonGroup},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-toolbar.inc.js",
   :file-min "material-ui/material-ui-toolbar.min.inc.js",
   :provides ["@material-ui/core/Toolbar"],
   :global-exports {"@material-ui/core/Toolbar" MaterialUIToolbar},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-tooltip.inc.js",
   :file-min "material-ui/material-ui-tooltip.min.inc.js",
   :provides ["@material-ui/core/Tooltip"],
   :global-exports {"@material-ui/core/Tooltip" MaterialUITooltip},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-typography.inc.js",
   :file-min "material-ui/material-ui-typography.min.inc.js",
   :provides ["@material-ui/core/Typography"],
   :global-exports
   {"@material-ui/core/Typography" MaterialUITypography},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-unstable-trap-focus.inc.js",
   :file-min "material-ui/material-ui-unstable-trap-focus.min.inc.js",
   :provides ["@material-ui/core/Unstable_TrapFocus"],
   :global-exports
   {"@material-ui/core/Unstable_TrapFocus"
    MaterialUIUnstableTrapFocus},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-zoom.inc.js",
   :file-min "material-ui/material-ui-zoom.min.inc.js",
   :provides ["@material-ui/core/Zoom"],
   :global-exports {"@material-ui/core/Zoom" MaterialUIZoom},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-use-autocomplete.inc.js",
   :file-min "material-ui/material-ui-use-autocomplete.min.inc.js",
   :provides ["@material-ui/core/useAutocomplete"],
   :global-exports
   {"@material-ui/core/useAutocomplete" MaterialUIUseAutocomplete},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-use-media-query.inc.js",
   :file-min "material-ui/material-ui-use-media-query.min.inc.js",
   :provides ["@material-ui/core/useMediaQuery"],
   :global-exports
   {"@material-ui/core/useMediaQuery" MaterialUIUseMediaQuery},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-use-pagination.inc.js",
   :file-min "material-ui/material-ui-use-pagination.min.inc.js",
   :provides ["@material-ui/core/usePagination"],
   :global-exports
   {"@material-ui/core/usePagination" MaterialUIUsePagination},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-use-scroll-trigger.inc.js",
   :file-min "material-ui/material-ui-use-scroll-trigger.min.inc.js",
   :provides ["@material-ui/core/useScrollTrigger"],
   :global-exports
   {"@material-ui/core/useScrollTrigger" MaterialUIUseScrollTrigger},
   :requires ["@material-ui/core"]}
  {:file "material-ui/material-ui-lab-clock-picker.inc.js",
   :file-min "material-ui/material-ui-lab-clock-picker.min.inc.js",
   :provides ["@material-ui/lab/ClockPicker"],
   :global-exports
   {"@material-ui/lab/ClockPicker" MaterialUILabClockPicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-date-picker.inc.js",
   :file-min "material-ui/material-ui-lab-date-picker.min.inc.js",
   :provides ["@material-ui/lab/DatePicker"],
   :global-exports
   {"@material-ui/lab/DatePicker" MaterialUILabDatePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-date-range-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-date-range-picker.min.inc.js",
   :provides ["@material-ui/lab/DateRangePicker"],
   :global-exports
   {"@material-ui/lab/DateRangePicker" MaterialUILabDateRangePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-date-range-picker-day.inc.js",
   :file-min
   "material-ui/material-ui-lab-date-range-picker-day.min.inc.js",
   :provides ["@material-ui/lab/DateRangePickerDay"],
   :global-exports
   {"@material-ui/lab/DateRangePickerDay"
    MaterialUILabDateRangePickerDay},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-date-time-picker.inc.js",
   :file-min "material-ui/material-ui-lab-date-time-picker.min.inc.js",
   :provides ["@material-ui/lab/DateTimePicker"],
   :global-exports
   {"@material-ui/lab/DateTimePicker" MaterialUILabDateTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-day-picker.inc.js",
   :file-min "material-ui/material-ui-lab-day-picker.min.inc.js",
   :provides ["@material-ui/lab/DayPicker"],
   :global-exports
   {"@material-ui/lab/DayPicker" MaterialUILabDayPicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-desktop-date-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-desktop-date-picker.min.inc.js",
   :provides ["@material-ui/lab/DesktopDatePicker"],
   :global-exports
   {"@material-ui/lab/DesktopDatePicker"
    MaterialUILabDesktopDatePicker},
   :requires ["@material-ui/lab"]}
  {:file
   "material-ui/material-ui-lab-desktop-date-range-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-desktop-date-range-picker.min.inc.js",
   :provides ["@material-ui/lab/DesktopDateRangePicker"],
   :global-exports
   {"@material-ui/lab/DesktopDateRangePicker"
    MaterialUILabDesktopDateRangePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-desktop-date-time-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-desktop-date-time-picker.min.inc.js",
   :provides ["@material-ui/lab/DesktopDateTimePicker"],
   :global-exports
   {"@material-ui/lab/DesktopDateTimePicker"
    MaterialUILabDesktopDateTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-desktop-time-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-desktop-time-picker.min.inc.js",
   :provides ["@material-ui/lab/DesktopTimePicker"],
   :global-exports
   {"@material-ui/lab/DesktopTimePicker"
    MaterialUILabDesktopTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-loading-button.inc.js",
   :file-min "material-ui/material-ui-lab-loading-button.min.inc.js",
   :provides ["@material-ui/lab/LoadingButton"],
   :global-exports
   {"@material-ui/lab/LoadingButton" MaterialUILabLoadingButton},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-localization-provider.inc.js",
   :file-min
   "material-ui/material-ui-lab-localization-provider.min.inc.js",
   :provides ["@material-ui/lab/LocalizationProvider"],
   :global-exports
   {"@material-ui/lab/LocalizationProvider"
    MaterialUILabLocalizationProvider},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-mobile-date-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-mobile-date-picker.min.inc.js",
   :provides ["@material-ui/lab/MobileDatePicker"],
   :global-exports
   {"@material-ui/lab/MobileDatePicker" MaterialUILabMobileDatePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-mobile-date-range-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-mobile-date-range-picker.min.inc.js",
   :provides ["@material-ui/lab/MobileDateRangePicker"],
   :global-exports
   {"@material-ui/lab/MobileDateRangePicker"
    MaterialUILabMobileDateRangePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-mobile-date-time-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-mobile-date-time-picker.min.inc.js",
   :provides ["@material-ui/lab/MobileDateTimePicker"],
   :global-exports
   {"@material-ui/lab/MobileDateTimePicker"
    MaterialUILabMobileDateTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-mobile-time-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-mobile-time-picker.min.inc.js",
   :provides ["@material-ui/lab/MobileTimePicker"],
   :global-exports
   {"@material-ui/lab/MobileTimePicker" MaterialUILabMobileTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-month-picker.inc.js",
   :file-min "material-ui/material-ui-lab-month-picker.min.inc.js",
   :provides ["@material-ui/lab/MonthPicker"],
   :global-exports
   {"@material-ui/lab/MonthPicker" MaterialUILabMonthPicker},
   :requires ["@material-ui/lab"]}
  {:file
   "material-ui/material-ui-lab-pickers-calendar-skeleton.inc.js",
   :file-min
   "material-ui/material-ui-lab-pickers-calendar-skeleton.min.inc.js",
   :provides ["@material-ui/lab/PickersCalendarSkeleton"],
   :global-exports
   {"@material-ui/lab/PickersCalendarSkeleton"
    MaterialUILabPickersCalendarSkeleton},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-pickers-day.inc.js",
   :file-min "material-ui/material-ui-lab-pickers-day.min.inc.js",
   :provides ["@material-ui/lab/PickersDay"],
   :global-exports
   {"@material-ui/lab/PickersDay" MaterialUILabPickersDay},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-static-date-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-static-date-picker.min.inc.js",
   :provides ["@material-ui/lab/StaticDatePicker"],
   :global-exports
   {"@material-ui/lab/StaticDatePicker" MaterialUILabStaticDatePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-static-date-range-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-static-date-range-picker.min.inc.js",
   :provides ["@material-ui/lab/StaticDateRangePicker"],
   :global-exports
   {"@material-ui/lab/StaticDateRangePicker"
    MaterialUILabStaticDateRangePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-static-date-time-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-static-date-time-picker.min.inc.js",
   :provides ["@material-ui/lab/StaticDateTimePicker"],
   :global-exports
   {"@material-ui/lab/StaticDateTimePicker"
    MaterialUILabStaticDateTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-static-time-picker.inc.js",
   :file-min
   "material-ui/material-ui-lab-static-time-picker.min.inc.js",
   :provides ["@material-ui/lab/StaticTimePicker"],
   :global-exports
   {"@material-ui/lab/StaticTimePicker" MaterialUILabStaticTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-tab-context.inc.js",
   :file-min "material-ui/material-ui-lab-tab-context.min.inc.js",
   :provides ["@material-ui/lab/TabContext"],
   :global-exports
   {"@material-ui/lab/TabContext" MaterialUILabTabContext},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-tab-list.inc.js",
   :file-min "material-ui/material-ui-lab-tab-list.min.inc.js",
   :provides ["@material-ui/lab/TabList"],
   :global-exports {"@material-ui/lab/TabList" MaterialUILabTabList},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-tab-panel.inc.js",
   :file-min "material-ui/material-ui-lab-tab-panel.min.inc.js",
   :provides ["@material-ui/lab/TabPanel"],
   :global-exports {"@material-ui/lab/TabPanel" MaterialUILabTabPanel},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-time-picker.inc.js",
   :file-min "material-ui/material-ui-lab-time-picker.min.inc.js",
   :provides ["@material-ui/lab/TimePicker"],
   :global-exports
   {"@material-ui/lab/TimePicker" MaterialUILabTimePicker},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-timeline.inc.js",
   :file-min "material-ui/material-ui-lab-timeline.min.inc.js",
   :provides ["@material-ui/lab/Timeline"],
   :global-exports {"@material-ui/lab/Timeline" MaterialUILabTimeline},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-timeline-connector.inc.js",
   :file-min
   "material-ui/material-ui-lab-timeline-connector.min.inc.js",
   :provides ["@material-ui/lab/TimelineConnector"],
   :global-exports
   {"@material-ui/lab/TimelineConnector"
    MaterialUILabTimelineConnector},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-timeline-content.inc.js",
   :file-min "material-ui/material-ui-lab-timeline-content.min.inc.js",
   :provides ["@material-ui/lab/TimelineContent"],
   :global-exports
   {"@material-ui/lab/TimelineContent" MaterialUILabTimelineContent},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-timeline-dot.inc.js",
   :file-min "material-ui/material-ui-lab-timeline-dot.min.inc.js",
   :provides ["@material-ui/lab/TimelineDot"],
   :global-exports
   {"@material-ui/lab/TimelineDot" MaterialUILabTimelineDot},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-timeline-item.inc.js",
   :file-min "material-ui/material-ui-lab-timeline-item.min.inc.js",
   :provides ["@material-ui/lab/TimelineItem"],
   :global-exports
   {"@material-ui/lab/TimelineItem" MaterialUILabTimelineItem},
   :requires ["@material-ui/lab"]}
  {:file
   "material-ui/material-ui-lab-timeline-opposite-content.inc.js",
   :file-min
   "material-ui/material-ui-lab-timeline-opposite-content.min.inc.js",
   :provides ["@material-ui/lab/TimelineOppositeContent"],
   :global-exports
   {"@material-ui/lab/TimelineOppositeContent"
    MaterialUILabTimelineOppositeContent},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-timeline-separator.inc.js",
   :file-min
   "material-ui/material-ui-lab-timeline-separator.min.inc.js",
   :provides ["@material-ui/lab/TimelineSeparator"],
   :global-exports
   {"@material-ui/lab/TimelineSeparator"
    MaterialUILabTimelineSeparator},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-tree-item.inc.js",
   :file-min "material-ui/material-ui-lab-tree-item.min.inc.js",
   :provides ["@material-ui/lab/TreeItem"],
   :global-exports {"@material-ui/lab/TreeItem" MaterialUILabTreeItem},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-tree-view.inc.js",
   :file-min "material-ui/material-ui-lab-tree-view.min.inc.js",
   :provides ["@material-ui/lab/TreeView"],
   :global-exports {"@material-ui/lab/TreeView" MaterialUILabTreeView},
   :requires ["@material-ui/lab"]}
  {:file "material-ui/material-ui-lab-year-picker.inc.js",
   :file-min "material-ui/material-ui-lab-year-picker.min.inc.js",
   :provides ["@material-ui/lab/YearPicker"],
   :global-exports
   {"@material-ui/lab/YearPicker" MaterialUILabYearPicker},
   :requires ["@material-ui/lab"]}),
 :externs ["material-ui/material-ui.ext.js"]}
