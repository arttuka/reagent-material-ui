(ns reagent-mui.icons.stop-screen-share-sharp
  "Imports @mui/icons-material/StopScreenShareSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stop-screen-share-sharp (create-svg-icon (e "path" #js {"d" "m21.79 18 2 2H24v-2zM13 9.13V7l4 3.74-1.28 1.19 5.18 5.18L22 16V4.02H7.8l5.13 5.13c.03-.01.05-.02.07-.02zM1.11 2.98l.89.9v12.14l2 1.99L0 18v2h18.13l2.71 2.71 1.41-1.41L2.52 1.57 1.11 2.98zm7.97 7.97 1.59 1.59C9.13 12.92 7.96 13.71 7 15c.31-1.48.94-2.93 2.08-4.05z"})
                                              "StopScreenShareSharp"))
