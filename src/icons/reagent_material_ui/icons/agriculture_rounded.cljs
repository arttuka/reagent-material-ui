(ns reagent-material-ui.icons.agriculture-rounded
  "Imports @material-ui/icons/AgricultureRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def agriculture-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19.5 12.1c.93 0 1.78.28 2.5.76V8.1c0-1.1-.9-2-2-2h-6.29l-1.06-1.06 1.05-1.05c.2-.2.2-.51 0-.71-.2-.2-.51-.2-.71 0L10.18 6.1c-.2.2-.2.51 0 .71.2.2.51.2.71 0l1.06-1.06L13 6.81V9.1c0 1.1-.9 2-2 2h-.54c.95 1.06 1.54 2.46 1.54 4 0 .34-.04.67-.09 1h3.14c.25-2.25 2.14-4 4.45-4z"}) (e "path" #js {"d" "M19.5 13.1c-1.93 0-3.5 1.57-3.5 3.5s1.57 3.5 3.5 3.5 3.5-1.57 3.5-3.5-1.57-3.5-3.5-3.5zm0 5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zM4 9.1h5c0-1.1-.9-2-2-2H4c-.55 0-1 .45-1 1s.45 1 1 1zm2 1c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm0 8c-1.65 0-3-1.35-3-3s1.35-3 3-3 3 1.35 3 3-1.35 3-3 3z"}) (e "circle" #js {"cy" "15.1", "r" "1.5", "cx" "6"}))
                                          "AgricultureRounded"))
