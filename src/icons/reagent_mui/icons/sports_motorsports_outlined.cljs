(ns reagent-mui.icons.sports-motorsports-outlined
  "Imports @mui/icons-material/SportsMotorsportsOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sports-motorsports-outlined (create-svg-icon (e "path" #js {"d" "M21.96 11.22C21.57 7.01 17.76 4 13.56 4c-.19 0-.38.01-.57.02C2 4.74 2 17.2 2 17.2v.8c0 1.1.9 2 2 2h10c4.67 0 8.41-4.01 7.96-8.78zm-16.7.34c.57-1.29 1.28-2.35 2.14-3.19l3.62 1.53c.6.25.98.83.98 1.48 0 .89-.72 1.61-1.61 1.61H4.72c.15-.46.32-.94.54-1.43zm13.18 4.48C17.3 17.29 15.68 18 14 18H4v-.8c0-.02.01-.92.24-2.2h6.15c1.99 0 3.61-1.62 3.61-3.61 0-1.45-.87-2.76-2.2-3.32L9.3 7.01c1.1-.57 2.37-.9 3.82-.99.15-.02.3-.02.44-.02 3.31 0 6.13 2.37 6.41 5.41.16 1.72-.38 3.36-1.53 4.63z"})
                                                  "SportsMotorsportsOutlined"))
