(ns reagent-material-ui.icons.portable-wifi-off-rounded
  "Imports @material-ui/icons/PortableWifiOffRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def portable-wifi-off-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7.94 5.11c.75-.45 1.57-.78 2.45-.95C15.5 3.16 20 7.06 20 12c0 1.48-.41 2.87-1.11 4.06l1.46 1.46c1.21-1.82 1.83-4.06 1.62-6.45-.42-4.66-4.17-8.49-8.82-9-2.48-.28-4.78.36-6.65 1.6l1.44 1.44z"}) (e "path" #js {"d" "M10.69 6.14c-.45.09-.87.26-1.28.45l1.55 1.55c.02 0 .04-.01.06-.02C13.65 7.49 16 9.48 16 12c0 .36-.05.7-.14 1.03l1.56 1.56c.37-.79.58-1.66.58-2.59 0-3.74-3.42-6.68-7.31-5.86zM3.51 3.51a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l1.57 1.57C2.62 8.08 2 9.96 2 12c0 2.36.82 4.53 2.18 6.24.37.47 1.07.5 1.5.08.36-.36.39-.93.07-1.32-1.4-1.74-2.08-4.08-1.6-6.57.17-.89.51-1.73.96-2.49l1.47 1.47c-.18.39-.33.79-.43 1.22-.38 1.73-.02 3.37.83 4.66.35.54 1.1.62 1.56.17.34-.34.37-.87.11-1.28-.58-.89-.81-2.03-.51-3.22L19.07 21.9c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L3.51 3.51z"}))
                                                "PortableWifiOffRounded"))
