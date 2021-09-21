(ns reagent-mui.icons.group-work-two-tone
  "Imports @mui/icons-material/GroupWorkTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def group-work-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4c-4.41 0-8 3.59-8 8s3.59 8 8 8 8-3.59 8-8-3.59-8-8-8zM8 16c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm4-6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2zm4 6c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z", "opacity" ".3"}) (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z"}) (e "circle" #js {"cx" "8", "cy" "14", "r" "2"}) (e "circle" #js {"cx" "12", "cy" "8", "r" "2"}) (e "circle" #js {"cx" "16", "cy" "14", "r" "2"})]
                                          "GroupWorkTwoTone"))
