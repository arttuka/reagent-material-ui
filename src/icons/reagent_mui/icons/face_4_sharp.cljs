(ns reagent-mui.icons.face-4-sharp
  "Imports @mui/icons-material/Face4Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def face-4-sharp (create-svg-icon [(e "path" #js {"d" "M12 2c-.96 0-1.88.14-2.75.39C8.37.96 6.8 0 5 0 2.24 0 0 2.24 0 5c0 1.8.96 3.37 2.39 4.25C2.14 10.12 2 11.04 2 12c0 5.52 4.48 10 10 10s10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8 0-.05.01-.1.01-.15 2.6-.98 4.68-2.99 5.74-5.55 1.83 2.26 4.62 3.7 7.75 3.7.75 0 1.47-.09 2.17-.24.21.71.33 1.46.33 2.24 0 4.41-3.59 8-8 8z"}) (e "circle" #js {"cx" "9", "cy" "13", "r" "1.25"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1.25"})]
                                   "Face4Sharp"))