(ns reagent-mui.material.avatar-group
  "Imports @mui/material/AvatarGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/avatar-group/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/AvatarGroup" :as MuiAvatarGroup]))

(def avatar-group (adapt-react-class (.-default MuiAvatarGroup) "mui-avatar-group"))
