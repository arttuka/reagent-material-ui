(ns reagent-mui.icons.browser-updated-sharp
  "Imports @mui/icons-material/BrowserUpdatedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def browser-updated-sharp (create-svg-icon (e "path" #js {"d" "M22 13v5h-5l1 1v2H6v-2l1-1H2V3h10v2H4v11h16v-3h2zm-7 2-5-5h4V3h2v7h4l-5 5z"})
                                            "BrowserUpdatedSharp"))
