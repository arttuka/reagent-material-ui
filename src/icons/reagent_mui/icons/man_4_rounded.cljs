(ns reagent-mui.icons.man-4-rounded
  "Imports @mui/icons-material/Man4Rounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-4-rounded (create-svg-icon [(e "path" #js {"d" "M13.75 7h-3.5C9.04 7 8.11 8.07 8.27 9.26L9.82 20.7c.1.74.74 1.3 1.49 1.3h1.38c.75 0 1.39-.55 1.49-1.3l1.56-11.44C15.89 8.07 14.96 7 13.75 7z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                    "Man4Rounded"))