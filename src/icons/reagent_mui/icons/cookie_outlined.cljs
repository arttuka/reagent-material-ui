(ns reagent-mui.icons.cookie-outlined
  "Imports @mui/icons-material/CookieOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cookie-outlined (create-svg-icon [(e "circle" #js {"cx" "10.5", "cy" "8.5", "r" "1.5"}) (e "circle" #js {"cx" "8.5", "cy" "13.5", "r" "1.5"}) (e "circle" #js {"cx" "15", "cy" "15", "r" "1"}) (e "path" #js {"d" "M21.95 10.99c-1.79-.03-3.7-1.95-2.68-4.22-2.97 1-5.78-1.59-5.19-4.56C7.11.74 2 6.41 2 12c0 5.52 4.48 10 10 10 5.89 0 10.54-5.08 9.95-11.01zM12 20c-4.41 0-8-3.59-8-8 0-3.31 2.73-8.18 8.08-8.02.42 2.54 2.44 4.56 4.99 4.94.07.36.52 2.55 2.92 3.63C19.7 16.86 16.06 20 12 20z"})]
                                      "CookieOutlined"))
