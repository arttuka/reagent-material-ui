(ns reagent-mui.icons.sports-handball
  "Imports @mui/icons-material/SportsHandball as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sports-handball (create-svg-icon [(e "path" #js {"d" "M14.27 6c-.55.95-.22 2.18.73 2.73.95.55 2.18.22 2.73-.73.55-.95.22-2.18-.73-2.73-.95-.55-2.18-.22-2.73.73z"}) (e "path" #js {"d" "M15.84 10.41s-1.63-.94-2.6-1.5c-2.38-1.38-3.2-4.44-1.82-6.82l-1.73-1C8.1 3.83 8.6 7.21 10.66 9.4l-5.15 8.92 1.73 1 1.5-2.6 1.73 1-3 5.2 1.73 1 6.29-10.89c1.14 1.55 1.33 3.69.31 5.46l1.73 1c1.6-2.75 1.28-6.58-1.69-9.08z"}) (e "path" #js {"d" "M12.75 3.8c.72.41 1.63.17 2.05-.55.41-.72.17-1.63-.55-2.05-.72-.41-1.63-.17-2.05.55-.41.72-.17 1.64.55 2.05z"})]
                                      "SportsHandball"))
