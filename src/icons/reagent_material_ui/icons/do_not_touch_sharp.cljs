(ns reagent-material-ui.icons.do-not-touch-sharp
  "Imports @material-ui/icons/DoNotTouchSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def do-not-touch-sharp (create-svg-icon (e "path" #js {"d" "M13 10.17l-2.5-2.5V1H13v9.17zM20 4h-2.5v7h-1V2H14v9.17l6 6V4zM9.5 3H7.01v1.18L9.5 6.67V3zm11.69 18.19L2.81 2.81 1.39 4.22 7 9.83v4.3l-3.32-1.9L2 13.88 9.68 22h9.54l.56.61 1.41-1.42z"})
                                         "DoNotTouchSharp"))
