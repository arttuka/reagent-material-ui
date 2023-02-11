(ns reagent-mui.material.avatar-group
  "Imports @mui/material/AvatarGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/avatar-group/ ."
  (:require [reagent.core :as r]
            ["@mui/material/AvatarGroup" :as MuiAvatarGroup]))

(def avatar-group (r/adapt-react-class (.-default MuiAvatarGroup)))
