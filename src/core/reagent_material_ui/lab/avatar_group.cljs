(ns reagent-material-ui.lab.avatar-group
  "Imports @material-ui/lab/AvatarGroup as a Reagent component.
   Original documentation is at https://material-ui.com/api/avatar-group/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/AvatarGroup" :as MuiAvatarGroup]))

(def avatar-group (adapt-react-class (or (.-default MuiAvatarGroup) (.-AvatarGroup MuiAvatarGroup)) "mui-avatar-group"))
