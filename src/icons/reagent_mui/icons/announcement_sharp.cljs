(ns reagent-mui.icons.announcement-sharp
  "Imports @mui/icons-material/AnnouncementSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def announcement-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zm-9 9h-2V5h2v6zm0 4h-2v-2h2v2z"})
                                         "AnnouncementSharp"))
