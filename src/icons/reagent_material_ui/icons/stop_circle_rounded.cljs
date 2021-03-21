(ns reagent-material-ui.icons.stop-circle-rounded
  "Imports @material-ui/icons/StopCircleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stop-circle-rounded (create-svg-icon (e "path" #js {"d" "M9 16h6c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1H9c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1zm3-14C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2z", "fillRule" "evenodd"})
                                          "StopCircleRounded"))
