(ns reagent-mui.icons.browser-updated
  "Imports @mui/icons-material/BrowserUpdated as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def browser-updated (create-svg-icon (e "path" #js {"d" "M22 13v3c0 1.1-.9 2-2 2h-3l1 1v2H6v-2l1-1H4c-1.1 0-2-.9-2-2V5c0-1.1.9-2 2-2h8v2H4v11h16v-3h2zm-7 2-5-5h4V3h2v7h4l-5 5z"})
                                      "BrowserUpdated"))
