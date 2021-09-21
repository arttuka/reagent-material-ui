(ns reagent-mui.icons.ios-share-two-tone
  "Imports @mui/icons-material/IosShareTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def ios-share-two-tone (create-svg-icon [(e "path" #js {"d" "M18 8h-3v2h3v11H6V10h3V8H6c-1.11 0-2 .89-2 2v11c0 1.1.89 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.11-.9-2-2-2z"}) (e "path" #js {"d" "M11 16h2V5h3l-4-4-4 4h3z"})]
                                         "IosShareTwoTone"))
