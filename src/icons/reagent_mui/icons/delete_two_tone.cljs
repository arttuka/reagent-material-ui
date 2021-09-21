(ns reagent-mui.icons.delete-two-tone
  "Imports @mui/icons-material/DeleteTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def delete-two-tone (create-svg-icon [(e "path" #js {"d" "M8 9h8v10H8z", "opacity" ".3"}) (e "path" #js {"d" "m15.5 4-1-1h-5l-1 1H5v2h14V4zM6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM8 9h8v10H8V9z"})]
                                      "DeleteTwoTone"))
