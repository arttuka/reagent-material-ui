(ns reagent-mui.icons.offline-share-sharp
  "Imports @mui/icons-material/OfflineShareSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def offline-share-sharp (create-svg-icon [(e "path" #js {"d" "M6 5H4v18h12v-2H6z"}) (e "path" #js {"d" "M20 1H8v18h12V1zm-2 14h-8V5h8v10z"}) (e "path" #js {"d" "M12.5 10.25h2V12L17 9.5 14.5 7v1.75H11V12h1.5z"})]
                                          "OfflineShareSharp"))
