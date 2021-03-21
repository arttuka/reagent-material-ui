(ns reagent-material-ui.icons.wifi-tethering-rounded
  "Imports @material-ui/icons/WifiTetheringRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wifi-tethering-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.25 7.05c-2.62.32-4.78 2.41-5.18 5.02-.24 1.55.13 3 .89 4.17.35.54 1.11.63 1.56.18l.01-.01c.34-.34.37-.87.11-1.27-.57-.88-.8-1.99-.49-3.18.35-1.37 1.47-2.47 2.84-2.82C13.63 8.47 16 10.46 16 13c0 .8-.24 1.53-.65 2.15-.27.41-.25.95.1 1.3l.01.01c.43.43 1.16.4 1.51-.11C17.61 15.4 18 14.24 18 13c0-3.56-3.11-6.4-6.75-5.95z"}) (e "path" #js {"d" "M5.66 19.27c.35-.35.4-.92.09-1.31-1.33-1.66-2.01-3.86-1.64-6.22.54-3.5 3.46-6.29 6.98-6.68C15.91 4.51 20 8.28 20 13c0 1.9-.67 3.62-1.77 4.99-.32.39-.28.96.08 1.32.42.42 1.12.39 1.49-.08C21.17 17.52 22 15.36 22 13c0-5.91-5.13-10.62-11.17-9.93-4.62.52-8.35 4.33-8.78 8.96-.26 2.72.59 5.23 2.12 7.16.37.47 1.07.5 1.49.08z"}) (e "circle" #js {"cy" "13", "r" "2", "cx" "12"}))
                                             "WifiTetheringRounded"))
