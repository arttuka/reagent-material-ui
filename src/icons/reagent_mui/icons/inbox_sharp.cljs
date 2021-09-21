(ns reagent-mui.icons.inbox-sharp
  "Imports @mui/icons-material/InboxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def inbox-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3.01v18H21V3zm-2 12h-4c0 1.66-1.35 3-3 3s-3-1.34-3-3H5V5h14v10z"})
                                  "InboxSharp"))
