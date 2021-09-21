(ns reagent-mui.icons.insert-invitation-sharp
  "Imports @mui/icons-material/InsertInvitationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-invitation-sharp (create-svg-icon (e "path" #js {"d" "M17 12h-5v5h5v-5zM16 1v2H8V1H6v2H3.01v18H21V3h-3V1h-2zm3 18H5V8h14v11z"})
                                              "InsertInvitationSharp"))
