public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u156b\u446c\ubded\ud158\u7873\u183a {
    public void \u156b\u446c\ubded\ud158\u7873\u183a(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub102\u873d\u3c25\u8350\u51fa\ubb2b p0) {
        var_4_7D : int
        var_5_9B : \u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\ub102\u873d\u3c25\u8350\u51fa\ubb2b(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::<init>, this:\u156b\u446c\ubded\ud158\u7873\u183a, invokevirtual:float(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\u9af2\ubff1\ua3b4\u3bd6\uceb8\ub113, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b), invokevirtual:float(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\u156b\ub102\ub70c\uc910\u8709\ud7e8, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b))
            putfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a, initobject:ArrayList(ArrayList<E>::<init>))
            var_4_7D = and:int(ldc:int(1391), ldc:int(-1392))
            
            while (cmplt:boolean(var_4_7D:int, invokevirtual:int(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\ud171\u760c\ucb79\uc9f6\u8d98\ubf56, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b))) {
                var_5_9B = invokevirtual:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\u647c\u5140\u3e75\uc2bd\u0c95\u76bc, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b, var_4_7D:int)
                invokevirtual:boolean(ArrayList<\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae>::add, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a), initobject:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::<init>, invokevirtual:int(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u5bc4\u965f\u51fa\uc7fe\ub18d\uc7fe, var_5_9B:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae), initobject:\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff(\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff::<init>, invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, var_5_9B:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae)), invokevirtual:\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u36d3\uceb8\u98a4\uc238\u8753\u416d, var_5_9B:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae), invokevirtual:\uff55\u873d\ubded\u759a\u9255\uc229(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u93a2\u156b\u97b7\ubb2b\u74b1\uc84e, var_5_9B:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae)))
                inc:int(var_4_7D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub102\u5245\ub18d\uc910\ubf56\u516c(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub102\u873d\u3c25\u8350\u51fa\ubb2b p0) {
        var_2_5F : int
        var_2_D6 : int
        var_4_7A : int
        var_5_B6 : \u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae
        var_6_C0 : String
        var_7_C9 : int
        var_8_105 : \u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(-2016814838), ldc:int(-270681058))
        
        if (cmpeq:boolean(invokevirtual:int(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\ud171\u760c\ucb79\uc9f6\u8d98\ubf56, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b), invokevirtual:int(ArrayList::size, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a)))) {
            var_2_D6 = and:int(var_2_5F:int, ldc:int(-1949566117))
            var_4_7A = and:int(ldc:int(24144), ldc:int(-24530))
            
            while (cmplt:boolean(var_4_7A:int, invokevirtual:int(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\ud171\u760c\ucb79\uc9f6\u8d98\ubf56, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b))) {
                var_5_B6 = invokevirtual:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\u647c\u5140\u3e75\uc2bd\u0c95\u76bc, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b, var_4_7A:int)
                var_6_C0 = invokevirtual:String(\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f::\u6c56\u3504\u3dd3\u8aa5\ub171\u97b7, invokevirtual:\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u36d3\uceb8\u98a4\uc238\u8753\u416d, var_5_B6:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae))
                var_7_C9 = and:int(ldc:int(4903), ldc:int(-4912))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_D6:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_D6 = and:int(var_2_D6:int, ldc:int(-252969133))
                        
                        if (cmplt:boolean(var_7_C9:int, invokevirtual:int(ArrayList::size, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a)))) {
                            var_8_105 = checkcast:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae.class, invokevirtual:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(ArrayList<\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae>::get, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a), var_7_C9:int))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f::\u6c56\u3504\u3dd3\u8aa5\ub171\u97b7, invokevirtual:\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u36d3\uceb8\u98a4\uc238\u8753\u416d, var_8_105:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae)), var_6_C0:String[expected:Object]))) {
                                var_2_D6 = and:int(var_2_D6:int, ldc:int(-2081439937))
                                inc:int(var_7_C9, ldc:int(1))
                                loopcontinue()
                            }
                            
                            invokevirtual:void(\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff::\u92ff\u156b\u6d99\u8df4\ud36e\ud158, checkcast:\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff(\u36d3\u9033\u6b0d\u983f\u8d90.\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff.class, invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, var_8_105:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae)), invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, var_5_B6:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae))
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_D6:int, ldc:int(1024)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_D6 = and:int(var_2_D6:int, ldc:int(-1931636596))
                inc:int(var_4_7A, ldc:int(1))
            }
            
            return:void()
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\u156b\u446c\ubded\ud158\u7873\u183a::\u74b1\u071d\u4f52\u74b1\u494c\uc29a), and:int(ldc:int(-10851), ldc:int(8802)))))
    }
    
    public void \u6ec6\u6435\u16f6\u5140\ud36e\uc910(\u5245\u8aa5\u61a4\u7049\u4cd9.\ub102\u873d\u3c25\u8350\u51fa\ubb2b p0) {
        var_2_5F : int
        var_4_67 : int
        var_2_C4 : int
        var_5_AE : \u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae
        var_6_B7 : int
        var_7_EA : \u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(-1088277205), ldc:int(-34461076))
            var_4_67 = and:int(ldc:int(5218), ldc:int(-5227))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_C4 = and:int(var_2_5F:int, ldc:int(469541282))
                }
                else {
                    var_2_C4 = and:int(var_2_5F:int, ldc:int(-47236228))
                    
                    if (cmplt:boolean(var_4_67:int, invokevirtual:int(ArrayList::size, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a)))) {
                        var_5_AE = checkcast:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae.class, invokevirtual:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(ArrayList<\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae>::get, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a), var_4_67:int))
                        var_6_B7 = and:int(ldc:int(6342), ldc:int(-6343))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(262144)), ldc:int(0))) {
                                var_2_C4 = and:int(var_2_C4:int, ldc:int(-1107380035))
                                
                                if (cmplt:boolean(var_6_B7:int, invokevirtual:int(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\ud171\u760c\ucb79\uc9f6\u8d98\ubf56, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b))) {
                                    var_7_EA = invokevirtual:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\ub102\u873d\u3c25\u8350\u51fa\ubb2b::\u647c\u5140\u3e75\uc2bd\u0c95\u76bc, p0:\ub102\u873d\u3c25\u8350\u51fa\ubb2b, var_6_B7:int)
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f::\u6c56\u3504\u3dd3\u8aa5\ub171\u97b7, invokevirtual:\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u36d3\uceb8\u98a4\uc238\u8753\u416d, var_7_EA:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae)), invokevirtual:String[expected:Object](\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f::\u6c56\u3504\u3dd3\u8aa5\ub171\u97b7, invokevirtual:\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u36d3\uceb8\u98a4\uc238\u8753\u416d, var_5_AE:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae))))) {
                                        var_2_C4 = and:int(var_2_C4:int, ldc:int(-42522644))
                                        inc:int(var_6_B7, ldc:int(1))
                                        loopcontinue()
                                    }
                                    
                                    invokevirtual:void(\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff::\u183a\uf9c5\u9033\u600f\u836c\u4daf, checkcast:\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff(\u36d3\u9033\u6b0d\u983f\u8d90.\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff.class, invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c[expected:\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff](\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, var_5_AE:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae)), invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, var_7_EA:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae))
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(262144)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_2_5F = and:int(var_2_C4:int, ldc:int(-8470614))
                        inc:int(var_4_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_C4:int, ldc:int(-21700712))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9af2\ud171\ud12e\u52d3\u6ec6\ucef1(float p0) {
        var_2_5F : int
        var_4_67 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(682139856), ldc:int(-1032217477))
            var_4_67 = and:int(ldc:int(-9491), ldc:int(9490))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1492054553))
                
                if (cmpge:boolean(var_4_67:int, invokevirtual:int(ArrayList::size, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff::\u071d\u76bc\u7bad\u3c25\u8d98\ubf56, checkcast:\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff(\u36d3\u9033\u6b0d\u983f\u8d90.\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff.class, invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, checkcast:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae.class, invokevirtual:Object(ArrayList::get, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a), var_4_67:int)))), p0:float)
                inc:int(var_4_67, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u6c56\u56bd\uc229\u8df4\u5654(float p0) {
        var_2_5F : int
        var_4_67 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(-1908970704), ldc:int(1790802815))
            var_4_67 = and:int(ldc:int(-29235), ldc:int(28720))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1997634365))
                
                if (cmpge:boolean(var_4_67:int, invokevirtual:int(ArrayList::size, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a)))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff::\ud217\u6b0d\u16f6\u527a\u983f\u6fb0, checkcast:\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff(\u36d3\u9033\u6b0d\u983f\u8d90.\u9255\u7e3f\u67e9\ub70c\uceb8\u92ff.class, invokevirtual:\u34df\u7d52\u7049\u5140\ucfaf\ub70c(\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae::\u392e\u7873\ub6ab\u5db4\u7c6b\u6b5f, checkcast:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae.class, invokevirtual:Object(ArrayList::get, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a), var_4_67:int)))), p0:float)
                inc:int(var_4_67, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ud171\u760c\ucb79\uc9f6\u8d98\ubf56() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(invokevirtual:int(ArrayList::size, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a)))
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae \u647c\u5140\u3e75\uc2bd\u0c95\u76bc(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(checkcast:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(\u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae.class, invokevirtual:\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae(ArrayList<\u4f52\u4d85\u6ec6\ud4fe\u67e9\u8cae>::get, getfield:ArrayList(\u156b\u446c\ubded\ud158\u7873\u183a::\u960f\u1833\ud12e\ufcaf\u3d64\u983f, this:\u156b\u446c\ubded\ud158\u7873\u183a), p0:int)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_169_0 : byte[] [generated]
        stack_1BC_0 : byte[] [generated]
        stack_218_0 : byte[] [generated]
        stack_288_0 : byte[] [generated]
        var_4_14C : int
        var_3_151 : byte[]
        var_5_152 : int
        expr_16C : byte [generated]
        var_0_20E : int
        expr_218 : byte [generated]
        stack_254_2 : byte [generated]
        stack_233_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1AB : byte[]
        var_5_1AC : int
        expr_BB : int [generated]
        expr_E6 : int [generated]
        var_3_277 : byte[]
        var_5_278 : int
        var_3_112 : String
        stack_145_0 : String[] [generated]
        expr_124 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_5F = and:int(ldc:int(-1888066518), ldc:int(-1610683350))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_169_0 = stack_1BC_0 = stack_218_0 = stack_288_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("nYl7e5FgjHZ+PMmBdoWHaIyJN3rBfol7fYd2Osp6iFx8")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_14C = expr_6B:int
        var_3_151 = newarray:byte[](byte.class, expr_6B:int)
        var_5_152 = expr_6B:int
        Label_0340:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-14682774))
            var_5_152 = add:int(var_5_152:int, ldc:int(-1))
            expr_16C = xor:byte(loadelement:byte(stack_169_0:byte[], var_5_152:int), ldc:byte(125))
            storeelement:byte(var_3_151:byte[], var_5_152:int, or:int(and:int(shl:int(expr_16C:byte, xor:int(ldc:int(-30656), ldc:int(-30652))), ldc:int(-16)), and:int(shr:int(expr_16C:byte[expected:int], and:int(ldc:int(7317), ldc:int(25156))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_152:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_169_0 = stack_1BC_0 = stack_218_0 = stack_288_0 = var_3_151:byte[]
            goto(Label_0112)
        }
        
        Label_0515:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
            var_0_20E = and:int(var_0_5F:int, ldc:int(-278928149))
            var_5_152 = add:int(var_5_152:int, ldc:int(-1))
            expr_218 = stack_254_2 = loadelement(stack_218_0, var_5_152)
            
            if (cmplt:boolean(add:int(add:int(var_5_152:int, ldc:int(1)), neg:int(var_4_14C:int)), ldc:int(0))) {
                stack_254_2 = stack_233_0 = add:byte(expr_218:byte, loadelement:byte(var_3_151:byte[], add:int(var_5_152:int, ldc:int(1))))
                goto(Label_0579)
            }
            
            Label_0549:
            
            if (cmpne:boolean(and:int(var_0_20E:int, ldc:int(131072)), ldc:int(0))) {
                var_0_20E = and:int(var_0_20E:int, ldc:int(-847285025))
                stack_254_2 = stack_233_0 = add:byte(expr_218:byte, ldc:byte(1))
            }
            
            Label_0579:
            
            if (cmpeq:boolean(and:int(var_0_20E:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0549)
            }
            
            var_0_5F = and:int(var_0_20E:int, ldc:int(-1377868510))
            storeelement:byte(var_3_151:byte[], var_5_152:int, stack_254_2:byte)
            
            if (cmpne:boolean(var_5_152:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_169_0 = stack_1BC_0 = stack_218_0 = stack_288_0 = var_3_151:byte[]
            goto(Label_0192)
        }
        
        goto(Label_0340)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1623268238))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1AB = newarray:byte[](byte.class, expr_90:int)
                var_5_1AC = expr_90:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-35658193))
                    var_5_1AC = add:int(var_5_1AC:int, ldc:int(-1))
                    storeelement:byte(var_3_1AB:byte[], var_5_1AC:int, add:int(shl:int(loadelement:byte(stack_1BC_0:byte[], var_5_1AC:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1AC:int, xor:int(ldc:int(10), ldc:int(11)))), ldc:int(4)), xor:int(ldc:int(222), ldc:int(209)))))
                    
                    if (cmpne:boolean(var_5_1AC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_169_0 = stack_1BC_0 = stack_218_0 = stack_288_0 = var_3_1AB:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(950590729))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-817889317))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_14C = expr_BB:int
                var_3_151 = newarray:byte[](byte.class, expr_BB:int)
                var_5_152 = expr_BB:int
                goto(Label_0515)
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1579681656))
                goto(Label_0149)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1109990069))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_277 = newarray:byte[](byte.class, expr_E6:int)
                var_5_278 = expr_E6:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-537461057))
                    var_5_278 = add:int(var_5_278:int, ldc:int(-1))
                    storeelement:byte(var_3_277:byte[], var_5_278:int, add:byte(loadelement:byte(stack_288_0:byte[], var_5_278:int), ldc:byte(81)))
                    
                    if (cmpne:boolean(var_5_278:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_106_0 = stack_169_0 = stack_1BC_0 = stack_218_0 = stack_288_0 = var_3_277:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_112 = initobject:String(String::<init>, stack_106_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_145_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3), ldc:int(8965)))
            expr_124 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6273), ldc:int(16647)))
            storeelement:String(expr_124:String[], and:int(ldc:int(5577), ldc:int(-5578)), invokevirtual:String[expected:String](String::substring, var_3_112:String, and:int(ldc:int(11987), ldc:int(-11988)), and:int(ldc:int(8233), ldc:int(3620))))
            putstatic:String[](\u156b\u446c\ubded\ud158\u7873\u183a::\u74b1\u071d\u4f52\u74b1\u494c\uc29a, expr_124:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u965f\u4cd9\u156b\u97e6\u92ee\u965f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_651 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BA : double
        var_3_CC : int
        var_11_DD : int
        var_14_107 : double
        var_16_10B : int
        var_12_103 : double
        var_17_65C : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_651 = and:int(ldc:int(1456349587), ldc:int(-478221317))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u156b\u446c\ubded\ud158\u7873\u183a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(-413703717))
            var_5_7D = and:int(ldc:int(7299), ldc:int(-31876))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5515), ldc:int(-13724)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BA = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CC = and:int(var_3_651:int, ldc:int(-94473930))
                    var_9_BA = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DD = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DD:int, sub:int(var_6_84:int, xor:int(ldc:int(-31735), ldc:int(-31736)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DD:int, and:int(ldc:int(9321), ldc:int(22529)))), var_7_93:double))) {
                        inc:int(var_11_DD, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_CC:int, ldc:int(-950043725))
                    var_14_107 = var_7_93:double
                    var_16_10B = var_11_DD:int
                }
                else {
                    var_11_DD = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(281), ldc:int(5)))
                    var_12_103 = var_14_107 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10B = var_11_DD:int, var_6_84:int)) {
                        var_9_BA = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DD:int)
                        var_16_10B = var_11_DD:int
                        var_14_107 = var_12_103:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(303630771))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(477629995))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1167485211))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-245105842))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(419119022))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-855526727))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-845497698))
                    }
                    else {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1657236754))
                        
                        if (cmplt:boolean(var_16_10B:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1810710757))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(57241367))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(807489019))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-535858241))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1406055358))
                            var_11_DD = and:int(ldc:int(15713), ldc:int(-16246))
                            goto(Label_1506)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1888170423))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1916200652))
                        goto(Label_1145)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-326696229))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(998480342))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(27834894))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(1674543034))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_107 = var_9_BA:double
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1119868926))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1181968028))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(940862968))
                        goto(Label_1145)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-2055646344))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1941007000))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(2145878323))
                        var_14_107 = mul:double(ldc:double(0.5), add:double(var_9_BA:double, var_14_107:double))
                    }
                    
                    Label_0840:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(656925590))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(345268916))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-171734508))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1177736087))
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1844862751))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1087329585))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(1585323354))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DD = xor:int(ldc:int(7176), ldc:int(7177))
                                goto(Label_1145)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1427325984))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(209942188))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(331621036))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1308110164))
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-554833285))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1240995883))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-672225346))
                        var_11_DD = and:int(ldc:int(12846), ldc:int(-15215))
                    }
                    
                    Label_1145:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1018906467))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(891728455))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-345578542))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                                goto(Label_1384)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1909321931))
                            goto(Label_1145)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(810516405))
                            goto(Label_0976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1321042751))
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1415364847))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1358533359))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1207876082))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_107:double, var_5_7D:int, var_16_10B:int)
                            goto(Label_1506)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1384:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1584736146))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(106588064))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(159394484))
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(1660908819))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_107:double, ldc:double(0.0))
                    Label_1506:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1517:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1667382620))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-783154715))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1071706039))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-288378081))
                        var_17_65C = add:int(var_16_10B:int, and:int(ldc:int(24641), ldc:int(2191)))
                        looporswitchbreak()
                    }
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(1189061491))
                
                if (cmple:boolean(var_5_7D = var_17_65C:int, sub:int(var_6_84:int, and:int(ldc:int(2415), ldc:int(145))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
