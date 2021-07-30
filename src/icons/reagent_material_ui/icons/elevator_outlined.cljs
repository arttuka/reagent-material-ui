(ns reagent-material-ui.icons.elevator-outlined
  "Imports @material-ui/icons/ElevatorOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def elevator-outlined (create-svg-icon (e "path" #js {"d" "M19 5v14H5V5h14m0-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-9 15v-4h1v-2.5c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2V14h1v4h3zM8.5 8.5c.69 0 1.25-.56 1.25-1.25S9.19 6 8.5 6s-1.25.56-1.25 1.25S7.81 8.5 8.5 8.5zM18 11l-2.5-4-2.5 4h5zm-5 2 2.5 4 2.5-4h-5z"})
                                        "ElevatorOutlined"))
