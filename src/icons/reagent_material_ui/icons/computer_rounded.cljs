(ns reagent-material-ui.icons.computer-rounded
  "Imports @material-ui/icons/ComputerRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def computer-rounded (create-svg-icon (e "path" #js {"d" "M4 18h16c1.1 0 1.99-.9 1.99-2L22 5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2zM4 5h16v11H4V5zM1 20c0 .55.45 1 1 1h20c.55 0 1-.45 1-1s-.45-1-1-1H2c-.55 0-1 .45-1 1z"})
                                       "ComputerRounded"))
