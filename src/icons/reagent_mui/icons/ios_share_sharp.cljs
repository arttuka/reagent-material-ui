(ns reagent-mui.icons.ios-share-sharp
  "Imports @mui/icons-material/IosShareSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def ios-share-sharp (create-svg-icon [(e "path" #js {"d" "M20 8h-5v2h3v11H6V10h3V8H4v15h16z"}) (e "path" #js {"d" "M11 16h2V5h3l-4-4-4 4h3z"})]
                                      "IosShareSharp"))
