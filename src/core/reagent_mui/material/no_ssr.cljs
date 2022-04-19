(ns reagent-mui.material.no-ssr
  "Imports @mui/material/NoSsr as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/no-ssr/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/NoSsr" :as MuiNoSsr]))

(def no-ssr (adapt-react-class (.-default MuiNoSsr) "mui-no-ssr"))
