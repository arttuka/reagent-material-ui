(ns reagent-mui.icons.roller-skating-rounded
  "Imports @mui/icons-material/RollerSkatingRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roller-skating-rounded (create-svg-icon (e "path" #js {"d" "M18 16c1.1 0 2-.9 2-2v-.88c0-2.1-1.55-3.53-3.03-3.88l-2.7-.67c-.87-.22-1.57-.81-1.95-1.57H9.5c-.28 0-.5-.22-.5-.5s.22-.5.5-.5h2.52L12 5H9.5c-.28 0-.5-.22-.5-.5s.22-.5.5-.5H12V3c0-1.1-.9-2-2-2H6c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h12zM5 23c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm14 0c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm-7 0c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"})
                                             "RollerSkatingRounded"))
