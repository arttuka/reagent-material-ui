(ns reagent-mui.icons.cameraswitch-sharp
  "Imports @mui/icons-material/CameraswitchSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cameraswitch-sharp (create-svg-icon [(e "path" #js {"d" "M14 6h-4L9 7H6v10h12V7h-3l-1-1zm-2 8c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"}) (e "path" #js {"d" "m8.57.51 4.48 4.48V2.04c4.72.47 8.48 4.23 8.95 8.95h2C23.34 3.02 15.49-1.59 8.57.51zm2.38 21.45c-4.72-.47-8.48-4.23-8.95-8.95H0c.66 7.97 8.51 12.58 15.43 10.48l-4.48-4.48v2.95z"})]
                                         "CameraswitchSharp"))
