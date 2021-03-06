(ns reagent-material-ui.icons.cell-wifi-outlined
  "Imports @material-ui/icons/CellWifiOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def cell-wifi-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 10.78V20h-9.22L20 10.78m2-4.81L6 22h16V5.97z", "opacity" ".3"}) (e "path" #js {"d" "M18 9.98L6 22h12V9.98zM3.93 5.93l1.29 1.29c3.19-3.19 8.38-3.19 11.57 0l1.29-1.29c-3.91-3.91-10.25-3.91-14.15 0zm5.14 5.14L11 13l1.93-1.93c-1.07-1.06-2.79-1.06-3.86 0zM6.5 8.5l1.29 1.29c1.77-1.77 4.65-1.77 6.43 0L15.5 8.5c-2.48-2.48-6.52-2.48-9 0z"}))
                                         "CellWifiOutlined"))
