(ns reagent-mui.icons.shield-moon-rounded
  "Imports @mui/icons-material/ShieldMoonRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shield-moon-rounded (create-svg-icon (e "path" #js {"d" "m11.3 2.26-6 2.25C4.52 4.81 4 5.55 4 6.39v4.7c0 4.83 3.13 9.37 7.43 10.75.37.12.77.12 1.14 0 4.3-1.38 7.43-5.91 7.43-10.75v-4.7c0-.83-.52-1.58-1.3-1.87l-6-2.25c-.45-.18-.95-.18-1.4-.01zm4.67 12.15c-1.84 2.17-5.21 2.1-6.96-.07-2.19-2.72-.65-6.72 2.69-7.33.34-.06.63.27.51.6-.46 1.23-.39 2.64.32 3.86.71 1.22 1.89 1.99 3.18 2.2.34.05.49.47.26.74z"})
                                          "ShieldMoonRounded"))
