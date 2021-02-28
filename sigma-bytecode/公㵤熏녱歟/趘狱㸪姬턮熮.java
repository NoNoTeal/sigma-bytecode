public class \u516c\u3d64\u718f\ub171\u6b5f.\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae {
    public void \u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            invokespecial:Object(Object::<init>, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)
            putfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, invokestatic:ArrayList[expected:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>](Lists::newArrayList))
            putfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, p0:\ube23\u67d0\u64f2\u839e\u76bc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u98a4\u960f\u64ab\u47c2\u416d\u516c() {
        var_1_F8 : int
        var_3_6B : Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_4_B3 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
        var_1_F8 = and:int(ldc:int(2058774728), ldc:int(798907791))
        invokespecial:void(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3bd6\u7e3f\u7af6\u98a4\u3e75\u7049, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)
        var_3_6B = invokevirtual:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ube23\u67d0\u64f2\u839e\u76bc::\uc29a\u4c2b\u7c6b\ufe34\u88c5\u3bc9, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
        
        if (invokevirtual:boolean(Optional<T>::isPresent, var_3_6B:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
            var_4_B3 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)), checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::get, var_3_6B:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ub32d\u624e\u4179\uc229\u4daf\ud51e)))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\uf995\u8640\u385b\ud4fe\u965f\u6bb9)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8350\u88c5\ub8be\u1187\ua562\u600f)))) {
                        goto(Label_0300)
                    }
                    
                    putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(10080), ldc:int(-10081))))
                    goto(Label_0652)
                }
            }
            
            Label_0192:
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(32768)), ldc:int(0))) {
                var_1_F8 = and:int(var_1_F8:int, ldc:int(-1095773567))
                goto(Label_0582)
            }
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0474)
            }
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(128)), ldc:int(0))) {
                var_1_F8 = and:int(var_1_F8:int, ldc:int(-62206595))
                goto(Label_0360)
            }
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(65536)), ldc:int(0))) {
                var_1_F8 = and:int(var_1_F8:int, ldc:int(-1349169224))
                putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(21), ldc:int(11909))))
                goto(Label_0652)
            }
            
            var_1_F8 = and:int(var_1_F8:int, ldc:int(-2025819292))
            Label_0300:
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(16384)), ldc:int(0))) {
                var_1_F8 = and:int(var_1_F8:int, ldc:int(-1874932301))
                goto(Label_0582)
            }
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0474)
            }
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_F8 = and:int(var_1_F8:int, ldc:int(-1215013388))
                    goto(Label_0192)
                }
                
                var_1_F8 = and:int(var_1_F8:int, ldc:int(1503416237))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u071d\uceb8\u67d0\u416d\u0c95\u97e6)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ud4fe\u3dd3\u927d\uc29a\u156b\uc3e3)))) {
                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u965f\u97b7\u5fe1\ub32d\u64f2\uc2e8))) {
                            goto(Label_0474)
                        }
                        
                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u839e\u983f\u56bd\u3e75\u3a62\ubb2b))) {
                            goto(Label_0474)
                        }
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_B3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc2bd\ub102\u416d\uc910\u4bc8\u6198)))) {
                            goto(Label_0582)
                        }
                        
                        putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(8213), ldc:int(2147))))
                        goto(Label_0652)
                    }
                }
            }
            
            Label_0360:
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0582)
            }
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0300)
                }
                
                if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_F8 = and:int(var_1_F8:int, ldc:int(-468091767))
                    goto(Label_0192)
                }
                
                var_1_F8 = and:int(var_1_F8:int, ldc:int(-371728741))
                putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(4), ldc:int(24926))))
                goto(Label_0652)
            }
            
            Label_0474:
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_F8 = and:int(var_1_F8:int, ldc:int(1190326990))
                    goto(Label_0360)
                }
                
                if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(256)), ldc:int(0))) {
                    var_1_F8 = and:int(var_1_F8:int, ldc:int(469302624))
                    goto(Label_0300)
                }
                
                if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_F8 = and:int(var_1_F8:int, ldc:int(2066094321))
                    goto(Label_0192)
                }
                
                var_1_F8 = and:int(var_1_F8:int, ldc:int(987692473))
                putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(1671), ldc:int(18691))))
                goto(Label_0652)
            }
            
            Label_0582:
            
            if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0474)
            }
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0360)
            }
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0300)
            }
            
            if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0192)
            }
            
            var_1_F8 = and:int(var_1_F8:int, ldc:int(1071468999))
            putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(18642), ldc:int(12579))))
            Label_0652:
            var_1_F8 = and:int(var_1_F8:int, ldc:int(-1466645323))
            goto(Label_0145)
        }
        
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_1_F8:int, ldc:int(262144)), ldc:int(0))) {
            var_1_F8 = and:int(var_1_F8:int, ldc:int(-806024959))
        }
        else {
            var_1_F8 = and:int(var_1_F8:int, ldc:int(2046289806))
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u120d\u12cb\u8258\ud51e\uc31c\u6bb9, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))) {
                putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), xor:int(ldc:int(278), ldc:int(272))))
            }
        }
        
        Label_0145:
        
        if (cmpne:boolean(and:int(var_1_F8:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u16f6\u3bd6\uae5d\u4bc8\u8413\ubf56(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033 p0, float p1, float p2) {
        var_6_87 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        
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
            invokevirtual:void(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1833\u4c2b\ubf56\u7330\ub1b9\u0b8e, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)
            invokevirtual:void(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u98a4\u960f\u64ab\u47c2\u416d\u516c, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)
            var_6_87 = initobject:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::<init>, p0:\u64f2\u718f\ub6ab\u9033\u8d90\u9033, getfield:int(\ube23\u67d0\u64f2\u839e\u76bc::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)), p1:float, p2:float, getfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae), getfield:float(\ube23\u67d0\u64f2\u839e\u76bc::\u0c95\u7e3f\ud36e\ub102\u5db4\u8d98, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
            invokeinterface:boolean(List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>::add, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae), var_6_87:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
            putfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ub32d\u8bb0\u64f2\ub113\u1833\u74b1, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, getfield:int(\ube23\u67d0\u64f2\u839e\u76bc::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
            putfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ub18d\uc31c\uf94d\u8bb0\u8d98\uc2bd, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, and:int[expected:boolean](ldc:int(26953), ldc:int(1061)))
            
            if (invokevirtual:boolean(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u5d20\u760c\ua6bd\u647c\u4d85\uc29a, var_6_87:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)) {
                if (logicalnot:boolean(getfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1187\u9af2\uc3e3\u6cfe\u7bad\ua068, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))) {
                    if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))) {
                        putfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1187\u9af2\uc3e3\u6cfe\u7bad\ua068, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, and:int[expected:boolean](ldc:int(273), ldc:int(29415)))
                        putfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u97b7\u8d98\u0a06\ub8be\u16f6\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, getfield:int(\ube23\u67d0\u64f2\u839e\u76bc::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                        putfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3c25\u12cb\u9937\u9937\u92ff\u3bc9, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, getfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u97b7\u8d98\u0a06\ub8be\u16f6\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
                        invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\u8709\u494c\u385b\uc229\u6d99\u3c25, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u7049\u56bd\u0a06\uc2bd\u4e72\ud7e8() {
        var_1_5F : int
        var_1_3BA : int
        var_3_75 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        var_4_93 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        var_5_9A : ITextComponent
        var_6_A4 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_8_10F : ITextComponent
        stack_199_1 : String [generated]
        expr_186 : Object[] [generated]
        var_7_BC : ITextComponent
        stack_3D3_0 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 [generated]
        stack_24B_1 : String [generated]
        expr_238 : Object[] [generated]
        var_1_293 : int
        var_9_29B : \u7d52\u718f\u3776\u6fb0\ub83f
        stack_2DB_0 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 [generated]
        var_1_2DA : int
        var_10_2DB : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_37C_1 : String [generated]
        expr_350 : Object[] [generated]
        stack_31F_1 : String [generated]
        expr_301 : Object[] [generated]
        var_1_3D2 : int
        var_9_3D3 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_474_1 : String [generated]
        expr_448 : Object[] [generated]
        stack_417_1 : String [generated]
        expr_3F9 : Object[] [generated]
        stack_EE_1 : String [generated]
        expr_DB : Object[] [generated]
        
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
        var_1_5F = and:int(ldc:int(1599995889), ldc:int(1919932818))
        
        if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))) {
            var_1_3BA = and:int(var_1_5F:int, ldc:int(399489759))
            var_3_75 = invokespecial:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u5d20\ube23\ub6ab\u7330\uf9c5\u6198, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)
            var_4_93 = checkcast:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab.class, invokeinterface:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>::get, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae), sub:int(invokeinterface:int(List<E>::size, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)), and:int(ldc:int(9257), ldc:int(4289)))))
            var_5_9A = invokevirtual:ITextComponent(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u416d\u61a4\u6b0d\ufcaf\u3e2a\u6d69, var_4_93:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
            var_6_A4 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8389\uc7fe\u8308\u183a\ub6ab\ub171, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_4_93:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab))
            
            if (logicaland:boolean(cmpne:boolean(var_3_75:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()), cmpeq:boolean(invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_4_93:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), getstatic:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\ud36e\u6bb9\u8258\u6ec6\u12b2\ud158)))) {
                var_8_10F = invokevirtual:ITextComponent(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u416d\u61a4\u6b0d\ufcaf\u3e2a\u6d69, var_3_75:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
                
                if (cmpne:boolean(invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_3_75:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), getstatic:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\ud36e\u6bb9\u8258\u6ec6\u12b2\ud158))) {
                    if (cmpne:boolean(invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_3_75:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), getstatic:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\ube23\u6d99\u9255\u97e6\uc2bd\u64ab))) {
                        if (cmpeq:boolean(var_8_10F:ITextComponent, aconstnull:ITextComponent())) {
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(var_5_9A:ITextComponent, aconstnull:ITextComponent())) {
                            goto(Label_0604)
                        }
                        
                        if (invokevirtual:boolean(Object::equals, var_8_10F:ITextComponent[expected:Object], var_5_9A:ITextComponent[expected:Object])) {
                            goto(Label_0443)
                        }
                        
                        goto(Label_0604)
                    }
                }
                
                Label_0283:
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_3BA = and:int(var_1_3BA:int, ldc:int(-168070326))
                    goto(Label_0918)
                }
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_3BA = and:int(var_1_3BA:int, ldc:int(-1036338539))
                    goto(Label_0604)
                }
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0493)
                }
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(128)), ldc:int(0))) {
                    stack_199_1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(2333), ldc:int(237)))), invokespecial:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u8258\u64ab\ube23\u4daf\u3776\ub7dc, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, var_3_75:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)))
                    expr_186 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17), ldc:int(18443)))
                    storeelement:Object(expr_186:Object[], and:int(ldc:int(-11063), ldc:int(10806)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                    var_7_BC = initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, stack_199_1:String, expr_186:Object[])
                    return:ITextComponent(var_7_BC:ITextComponent)
                }
                
                var_1_3BA = and:int(var_1_3BA:int, ldc:int(-1967357905))
                Label_0443:
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_3BA = and:int(var_1_3BA:int, ldc:int(1204388628))
                    goto(Label_0918)
                }
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0604)
                }
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0283)
                    }
                    
                    var_1_3BA = and:int(var_1_3BA:int, ldc:int(979368859))
                    
                    if (cmpne:boolean(var_5_9A:ITextComponent, aconstnull:ITextComponent())) {
                        if (logicalnot:boolean(instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_6_A4:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                            goto(Label_0918)
                        }
                        
                        stack_3D3_0 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_6_A4:\ube23\u67d0\u64f2\u839e\u76bc))
                        goto(Label_0973)
                    }
                }
                
                Label_0493:
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0918)
                }
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_1_3BA = and:int(var_1_3BA:int, ldc:int(-277780783))
                        goto(Label_0443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_3BA = and:int(var_1_3BA:int, ldc:int(1397082254))
                        goto(Label_0283)
                    }
                    
                    stack_24B_1 = loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(12), ldc:int(12318)))
                    expr_238 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-14080), ldc:int(-14079)))
                    storeelement:Object(expr_238:Object[], and:int(ldc:int(-31192), ldc:int(20935)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                    var_7_BC = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_24B_1:String, expr_238:Object[])
                    return:ITextComponent(var_7_BC:ITextComponent)
                }
                
                Label_0604:
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_3BA = and:int(var_1_3BA:int, ldc:int(536316097))
                        goto(Label_0493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_3BA = and:int(var_1_3BA:int, ldc:int(-595636440))
                        goto(Label_0283)
                    }
                    
                    var_1_293 = and:int(var_1_3BA:int, ldc:int(643808913))
                    var_9_29B = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8389\uc7fe\u8308\u183a\ub6ab\ub171, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_3_75:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab))
                    
                    if (logicalnot:boolean(instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_9_29B:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                        var_1_293 = and:int(var_1_293:int, ldc:int(-1954545964))
                        stack_2DB_0 = getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2)
                    }
                    else {
                        stack_2DB_0 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_9_29B:\ube23\u67d0\u64f2\u839e\u76bc))
                    }
                    
                    var_1_2DA = and:int(var_1_293:int, ldc:int(1800249298))
                    var_10_2DB = stack_2DB_0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
                    
                    if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_10_2DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u647c\ub83f\ud7e8\ua3b4\u4d85\u0a06, var_10_2DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        stack_37C_1 = loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(16392), ldc:int(13688)))
                        expr_350 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4135), ldc:int(4059)))
                        storeelement:Object(expr_350:Object[], and:int(ldc:int(7020), ldc:int(-7021)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                        storeelement:Object(expr_350:Object[], and:int(ldc:int(4193), ldc:int(9217)), var_8_10F:ITextComponent[expected:Object])
                        storeelement:Object(expr_350:Object[], and:int(ldc:int(195), ldc:int(2582)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, var_10_2DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                        var_7_BC = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_37C_1:String, expr_350:Object[])
                    }
                    else {
                        var_1_2DA = and:int(var_1_2DA:int, ldc:int(1073610492))
                        stack_31F_1 = loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), xor:int(ldc:int(-32749), ldc:int(-32742)))
                        expr_301 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18947), ldc:int(18945)))
                        storeelement:Object(expr_301:Object[], and:int(ldc:int(10472), ldc:int(-11497)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                        storeelement:Object(expr_301:Object[], and:int(ldc:int(4099), ldc:int(18177)), var_8_10F:ITextComponent[expected:Object])
                        var_7_BC = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_31F_1:String, expr_301:Object[])
                    }
                    
                    return:ITextComponent(var_7_BC:ITextComponent)
                }
                
                Label_0918:
                
                if (cmpne:boolean(and:int(var_1_3BA:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0604)
                }
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0493)
                }
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0443)
                }
                
                if (cmpeq:boolean(and:int(var_1_3BA:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                var_1_3BA = and:int(var_1_3BA:int, ldc:int(-1411531119))
                stack_3D3_0 = getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2)
                Label_0973:
                var_1_3D2 = and:int(var_1_3BA:int, ldc:int(721272212))
                var_9_3D3 = stack_3D3_0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
                
                if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_9_3D3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u647c\ub83f\ud7e8\ua3b4\u4d85\u0a06, var_9_3D3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                    stack_474_1 = loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(16667), ldc:int(9742)))
                    expr_448 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(10819), ldc:int(139)))
                    storeelement:Object(expr_448:Object[], and:int(ldc:int(12808), ldc:int(-12809)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                    storeelement:Object(expr_448:Object[], xor:int(ldc:int(-30460), ldc:int(-30459)), var_5_9A:ITextComponent[expected:Object])
                    storeelement:Object(expr_448:Object[], and:int(ldc:int(79), ldc:int(8098)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, var_9_3D3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                    var_7_BC = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_474_1:String, expr_448:Object[])
                }
                else {
                    var_1_3D2 = and:int(var_1_3D2:int, ldc:int(107995068))
                    stack_417_1 = loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), xor:int(ldc:int(43), ldc:int(32)))
                    expr_3F9 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1427), ldc:int(8238)))
                    storeelement:Object(expr_3F9:Object[], and:int(ldc:int(-15436), ldc:int(11339)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
                    storeelement:Object(expr_3F9:Object[], xor:int(ldc:int(5168), ldc:int(5169)), var_5_9A:ITextComponent[expected:Object])
                    var_7_BC = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_417_1:String, expr_3F9:Object[])
                }
            }
            else {
                var_7_BC = invokevirtual:ITextComponent(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\ua3b4\u12b2\uc2bd\uc910\u7af6\u385b, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_4_93:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
            }
            
            return:ITextComponent(var_7_BC:ITextComponent)
        }
        
        stack_EE_1 = loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), xor:int(ldc:int(-30591), ldc:int(-30586)))
        expr_DB = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16496), ldc:int(16497)))
        storeelement:Object(expr_DB:Object[], and:int(ldc:int(158), ldc:int(-223)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
        return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_EE_1:String, expr_DB:Object[]))
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \u8753\u6bb9\u759a\u7c6b\u36d3\u3776() {
        var_3_63 : \ube23\u67d0\u64f2\u839e\u76bc
        var_4_65 : \ube23\u67d0\u64f2\u839e\u76bc
        var_5_68 : float
        var_6_6B : float
        var_7_76 : Iterator<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>
        var_8_99 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        
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
            var_3_63 = aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()
            var_4_65 = aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()
            var_5_68 = ldc:float(0.0f)
            var_6_6B = ldc:float(0.0f)
            var_7_76 = invokeinterface:Iterator<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>::iterator, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_76:Iterator<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>)) {
                var_8_99 = checkcast:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab.class, invokeinterface:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(Iterator<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>::next, var_7_76:Iterator<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>))
                
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8389\uc7fe\u8308\u183a\ub6ab\ub171, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)))) {
                    if (logicalor:boolean(cmpeq:boolean(var_4_65:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()), cmpgt:boolean(invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u718f\u9033\u3d4b\u88c5\uc2bd\ubb2b, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), var_6_6B:float))) {
                        var_6_6B = invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u718f\u9033\u3d4b\u88c5\uc2bd\ubb2b, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
                        var_4_65 = checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8389\uc7fe\u8308\u183a\ub6ab\ub171, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)))
                    }
                }
                
                if (logicalnot:boolean(instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8389\uc7fe\u8308\u183a\ub6ab\ub171, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab))))) {
                    loopcontinue()
                }
                
                if (logicaland:boolean(cmpne:boolean(var_3_63:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()), cmple:boolean(invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u718f\u9033\u3d4b\u88c5\uc2bd\ubb2b, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), var_5_68:float))) {
                    loopcontinue()
                }
                
                var_5_68 = invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u718f\u9033\u3d4b\u88c5\uc2bd\ubb2b, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
                var_3_63 = checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\u8389\uc7fe\u8308\u183a\ub6ab\ub171, invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_8_99:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)))
            }
            
            return:\ube23\u67d0\u64f2\u839e\u76bc(ternaryop:\ube23\u67d0\u64f2\u839e\u76bc(logicaland:boolean(cmpne:boolean(var_4_65:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc()), cmpge:boolean(var_6_6B:float, div:float(var_5_68:float, ldc:float(3.0f)))), var_4_65:\ube23\u67d0\u64f2\u839e\u76bc, var_3_63:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab \u5d20\ube23\ub6ab\u7330\uf9c5\u6198() {
        var_3_63 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        var_4_65 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        var_5_68 : float
        var_6_6B : float
        var_7_74 : int
        var_8_AC : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        var_9_D1 : \u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
        
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
        var_3_63 = aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()
        var_4_65 = aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()
        var_5_68 = ldc:float(0.0f)
        var_6_6B = ldc:float(0.0f)
        var_7_74 = and:int(ldc:int(1191), ldc:int(-9400))
        
        while (cmplt:boolean(var_7_74:int, invokeinterface:int(List<E>::size, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))) {
            var_8_AC = checkcast:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab.class, invokeinterface:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>::get, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae), var_7_74:int))
            var_9_D1 = ternaryop:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(cmple:boolean(var_7_74:int, ldc:int(0)), aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(), checkcast:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab.class, invokeinterface:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>::get, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae), sub:int(var_7_74:int, and:int(ldc:int(1477), ldc:int(10241))))))
            
            if (logicalor:boolean(cmpeq:boolean(invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), getstatic:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\ud36e\u6bb9\u8258\u6ec6\u12b2\ud158)), cmpeq:boolean(invokevirtual:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3bc9\u8413\u5245\u494c\u416d\u3a62, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), getstatic:\u64f2\u718f\ub6ab\u9033\u8d90\u9033(\u64f2\u718f\ub6ab\u9033\u8d90\u9033::\ube23\u6d99\u9255\u97e6\uc2bd\u64ab)))) {
                if (cmpgt:boolean(invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3e75\u8709\uceb8\uc910\u5245\u6cfe, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), ldc:float(0.0f))) {
                    if (logicalor:boolean(cmpeq:boolean(var_3_63:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()), cmpgt:boolean(invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3e75\u8709\uceb8\uc910\u5245\u6cfe, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), var_6_6B:float))) {
                        if (cmple:boolean(var_7_74:int, ldc:int(0))) {
                            var_3_63 = var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
                        }
                        else {
                            var_3_63 = var_9_D1:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
                        }
                        
                        var_6_6B = invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u3e75\u8709\uceb8\uc910\u5245\u6cfe, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
                    }
                }
            }
            
            if (cmpne:boolean(invokevirtual:String(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u64f2\u760c\u3e75\ufcaf\u8389\uc9f6, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), aconstnull:String())) {
                if (logicalor:boolean(cmpeq:boolean(var_4_65:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()), cmpgt:boolean(invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u718f\u9033\u3d4b\u88c5\uc2bd\ubb2b, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), var_5_68:float))) {
                    var_4_65 = var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab
                    var_5_68 = invokevirtual:float(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u718f\u9033\u3d4b\u88c5\uc2bd\ubb2b, var_8_AC:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
                }
            }
            
            inc:int(var_7_74, ldc:int(1))
        }
        
        if (logicaland:boolean(cmpgt:boolean(var_6_6B:float, ldc:float(5.0f)), cmpne:boolean(var_3_63:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()))) {
            return:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(var_3_63:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab)
        }
        
        return:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(ternaryop:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab(logicaland:boolean(cmpgt:boolean(var_5_68:float, ldc:float(5.0f)), cmpne:boolean(var_4_65:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab())), var_4_65:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, aconstnull:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab()))
    }
    
    private java.lang.String \u8258\u64ab\ube23\u4daf\u3776\ub7dc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab p0) {
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
            return:String(ternaryop:String(cmpne:boolean(invokevirtual:String(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u64f2\u760c\u3e75\ufcaf\u8389\uc9f6, p0:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), aconstnull:String()), invokevirtual:String(\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab::\u64f2\u760c\u3e75\ufcaf\u8389\uc9f6, p0:\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab), loadelement:String(getstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776), and:int(ldc:int(526), ldc:int(16654)))))
        }
        
        goto(Label_0006)
    }
    
    public int \ubcb0\u760c\u494c\u120d\u4492\u7bad() {
        var_1_61 : int
        stack_91_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(3730297), ldc:int(1153204945))
            
            if (logicalnot:boolean(getfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1187\u9af2\uc3e3\u6cfe\u7bad\ua068, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(343526129))
                stack_91_0 = sub:int(getfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3c25\u12cb\u9937\u9937\u92ff\u3bc9, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae), getfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u97b7\u8d98\u0a06\ub8be\u16f6\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
            }
            else {
                stack_91_0 = sub:int(getfield:int(\ube23\u67d0\u64f2\u839e\u76bc::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)), getfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u97b7\u8d98\u0a06\ub8be\u16f6\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
            }
            
            return:int(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u3bd6\u7e3f\u7af6\u98a4\u3e75\u7049() {
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
            putfield:String(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3776\u839e\ubcb0\u5bc4\u759a\u4c2b, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, aconstnull:String())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u4c2b\ubf56\u7330\ub1b9\u0b8e() {
        var_1_61 : int
        stack_85_0 : int [generated]
        var_1_84 : int
        var_3_85 : int
        var_1_BF : int
        var_4_C4 : boolean
        
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
        var_1_61 = and:int(ldc:int(1358669472), ldc:int(-17067050))
        
        if (logicalnot:boolean(getfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1187\u9af2\uc3e3\u6cfe\u7bad\ua068, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))) {
            var_1_61 = and:int(var_1_61:int, ldc:int(-583279684))
            stack_85_0 = ldc:int(100)
        }
        else {
            stack_85_0 = xor:int(ldc:int(8376), ldc:int(8596))
        }
        
        var_1_84 = and:int(var_1_61:int, ldc:int(1538754282))
        var_3_85 = stack_85_0:int
        
        if (getfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ub18d\uc31c\uf94d\u8bb0\u8d98\uc2bd, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)) {
            if (logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))) {
                goto(Label_0169)
            }
            
            if (cmpgt:boolean(sub:int(getfield:int(\ube23\u67d0\u64f2\u839e\u76bc::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)), getfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ub32d\u8bb0\u64f2\ub113\u1833\u74b1, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)), var_3_85:int)) {
                goto(Label_0169)
            }
        }
        
        Label_0141:
        
        if (cmpeq:boolean(and:int(var_1_84:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        Label_0169:
        
        if (cmpeq:boolean(and:int(var_1_84:int, ldc:int(268435456)), ldc:int(0))) {
            var_1_84 = and:int(var_1_84:int, ldc:int(-1047145273))
            goto(Label_0141)
        }
        
        var_1_BF = and:int(var_1_84:int, ldc:int(1912574930))
        var_4_C4 = getfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1187\u9af2\uc3e3\u6cfe\u7bad\ua068, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)
        putfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ub18d\uc31c\uf94d\u8bb0\u8d98\uc2bd, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, and:int[expected:boolean](ldc:int(-21520), ldc:int(21517)))
        putfield:boolean(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u1187\u9af2\uc3e3\u6cfe\u7bad\ua068, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, and:int[expected:boolean](ldc:int(-19477), ldc:int(19476)))
        putfield:int(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u3c25\u12cb\u9937\u9937\u92ff\u3bc9, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae, getfield:int(\ube23\u67d0\u64f2\u839e\u76bc::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae)))
        
        if (var_4_C4:boolean) {
            invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\uf9c5\u92ee\u4492\u8bb0\u600f\ud158, getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
        }
        
        var_1_84 = and:int(var_1_BF:int, ldc:int(2050746272))
        invokeinterface:void(List<E>::clear, getfield:List<\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab>(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\ud4fe\u92ee\u6d69\u494c\uae87\u3e75, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
        goto(Label_0141)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \u624e\u8c8a\u7049\u965f\uc3e3\u7049() {
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
            return:\ube23\u67d0\u64f2\u839e\u76bc(getfield:\ube23\u67d0\u64f2\u839e\u76bc(\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u6b0d\ua562\u67e9\u3bd6\u7bad\u5140, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_30D : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D2_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_10D_0 : byte[] [generated]
        stack_139_0 : byte[] [generated]
        stack_320_0 : byte[] [generated]
        stack_388_0 : byte[] [generated]
        stack_40C_0 : byte[] [generated]
        stack_462_0 : byte[] [generated]
        var_4_2F9 : int
        var_3_2FE : byte[]
        var_5_2FF : int
        expr_320 : byte [generated]
        var_0_3A2 : int
        expr_388 : byte [generated]
        stack_3DA_2 : byte [generated]
        stack_3AE_0 : byte [generated]
        expr_A5 : int [generated]
        var_2_D2 : byte[]
        expr_D6 : int [generated]
        var_3_3FA : byte[]
        var_5_3FB : int
        expr_10D : int [generated]
        var_3_450 : byte[]
        var_5_451 : int
        var_3_145 : String
        stack_2F2_0 : String[] [generated]
        expr_157 : String[] [generated]
        
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
        var_0_30D = and:int(ldc:int(-1298165225), ldc:int(-223528483))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D2_0 = stack_D4_0 = stack_10B_0 = stack_10D_0 = stack_139_0 = stack_320_0 = stack_388_0 = stack_40C_0 = stack_462_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("RMHIxski4cnGx8lPLMJCwMRCT+DKT0DKZKzGwUHBo8TJ58rCz0JNRkBPQMpkrMbJScEsTc5HScrlQ09AymSsxslJwSxtyUXPQkOnxERA7s9PQMpkrETOy8EsQ0FCxsrlTU9AymSsRM7LwSxjTEBNQkOhxERA7s9PQMpkrMHOzEAjTkJCT8PJxELMxsBHQsjOxk7PyclGRM9MSE/AQEJNz0BOQ0vDz0xMzz3KzUtNT1NItM7FzcS51MbNxLheysrEOV5JTkJOUkiyx8PNxGoUjwmLB24=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2F9 = expr_6E:int
        var_3_2FE = newarray:byte[](byte.class, expr_6E:int)
        var_5_2FF = expr_6E:int
        Label_0769:
        
        while (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(256)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(370114015))
            var_5_2FF = add:int(var_5_2FF:int, ldc:int(-1))
            expr_320 = loadelement:byte(stack_320_0:byte[], var_5_2FF:int)
            storeelement:byte(var_3_2FE:byte[], var_5_2FF:int, xor:int(or:int(and:int(shl:int(expr_320:byte, and:int(ldc:int(2252), ldc:int(22053))), ldc:int(-16)), and:int(shr:int(expr_320:byte[expected:int], xor:int(ldc:int(9474), ldc:int(9478))), ldc:int(15))), ldc:int(4)))
            
            if (cmpne:boolean(var_5_2FF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10B_0 = stack_10D_0 = stack_139_0 = stack_320_0 = stack_388_0 = stack_40C_0 = stack_462_0 = var_3_2FE:byte[]
            goto(Label_0115)
        }
        
        var_0_30D = and:int(var_0_30D:int, ldc:int(918079853))
        Label_0872:
        
        while (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(8192)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_30D:int, ldc:int(1588534389))
            var_5_2FF = add:int(var_5_2FF:int, ldc:int(-1))
            expr_388 = stack_3DA_2 = loadelement(stack_388_0, var_5_2FF)
            
            if (cmplt:boolean(add:int(add:int(var_5_2FF:int, ldc:int(6)), neg:int(var_4_2F9:int)), ldc:int(0))) {
                stack_3DA_2 = stack_3AE_0 = add:byte(expr_388:byte, loadelement:byte(var_3_2FE:byte[], add:int(var_5_2FF:int, ldc:int(6))))
                goto(Label_0958)
            }
            
            Label_0917:
            
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1103530305))
            }
            else {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1050663479))
                stack_3DA_2 = stack_3AE_0 = add:byte(expr_388:byte, ldc:byte(6))
            }
            
            Label_0958:
            
            if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(1024)), ldc:int(0))) {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-583505831))
                goto(Label_0917)
            }
            
            var_0_30D = and:int(var_0_3A2:int, ldc:int(-1714465361))
            storeelement:byte(var_3_2FE:byte[], var_5_2FF:int, stack_3DA_2:byte)
            
            if (cmpne:boolean(var_5_2FF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10B_0 = stack_10D_0 = stack_139_0 = stack_320_0 = stack_388_0 = stack_40C_0 = stack_462_0 = var_3_2FE:byte[]
            goto(Label_0170)
        }
        
        var_0_30D = and:int(var_0_30D:int, ldc:int(328322121))
        goto(Label_0769)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(65536)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(605643159))
            goto(Label_0274)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(4096)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(1996488700))
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(128)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(339718773))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_2F9 = expr_A5:int
                var_3_2FE = newarray:byte[](byte.class, expr_A5:int)
                var_5_2FF = expr_A5:int
                goto(Label_0872)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0274)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(4096)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(1576953312))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-1756506867))
            var_2_D2 = stack_D2_0:byte[]
            expr_D6 = add:int(arraylength:int(stack_D4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D6:int, ldc:int(0))) {
                var_3_3FA = newarray:byte[](byte.class, expr_D6:int)
                var_5_3FB = expr_D6:int
                
                loop {
                    var_0_30D = and:int(var_0_30D:int, ldc:int(1984781351))
                    var_5_3FB = add:int(var_5_3FB:int, ldc:int(-1))
                    storeelement:byte(var_3_3FA:byte[], var_5_3FB:int, add:int(shl:int(loadelement:byte(stack_40C_0:byte[], var_5_3FB:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_D2:byte[], add:int(var_5_3FB:int, and:int(ldc:int(195), ldc:int(4621)))), ldc:int(3)), xor:int(ldc:int(12845), ldc:int(12850)))))
                    
                    if (cmpne:boolean(var_5_3FB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10B_0 = stack_10D_0 = stack_139_0 = stack_320_0 = stack_388_0 = stack_40C_0 = stack_462_0 = var_3_3FA:byte[]
            }
        }
        
        Label_0219:
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(65536)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(1323696630))
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(65536)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(160094522))
                goto(Label_0115)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-1148332609))
            expr_10D = arraylength:int(stack_10D_0:byte[])
            
            if (cmpne:boolean(expr_10D:int, ldc:int(0))) {
                var_3_450 = newarray:byte[](byte.class, expr_10D:int)
                var_5_451 = expr_10D:int
                
                loop {
                    var_0_30D = and:int(var_0_30D:int, ldc:int(-146941937))
                    var_5_451 = add:int(var_5_451:int, ldc:int(-1))
                    storeelement:byte(var_3_450:byte[], var_5_451:int, add:byte(loadelement:byte(stack_462_0:byte[], var_5_451:int), ldc:byte(22)))
                    
                    if (cmpne:boolean(var_5_451:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D2_0 = stack_D4_0 = stack_10B_0 = stack_10D_0 = stack_139_0 = stack_320_0 = stack_388_0 = stack_40C_0 = stack_462_0 = var_3_450:byte[]
            }
        }
        
        Label_0274:
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(262144)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(1953039003))
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(4096)), ldc:int(0))) {
            var_3_145 = initobject:String(String::<init>, stack_139_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2F2_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11311), ldc:int(15)))
            expr_157 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2578), ldc:int(2589)))
            storeelement:String(expr_157:String[], and:int(ldc:int(6159), ldc:int(103)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(1253), ldc:int(-11504)), and:int(ldc:int(17556), ldc:int(116))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(12444), ldc:int(12433)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(4111), ldc:int(4123)), xor:int(ldc:int(-24559), ldc:int(-24519))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(8230), ldc:int(8239)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(812), ldc:int(4152)), xor:int(ldc:int(17426), ldc:int(17451))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(17926), ldc:int(17934)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(4473), ldc:int(8255)), xor:int(ldc:int(56), ldc:int(119))))
            storeelement:String(expr_157:String[], and:int(ldc:int(8207), ldc:int(18715)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(20484), ldc:int(20555)), and:int(ldc:int(4596), ldc:int(10346))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(132), ldc:int(142)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(18775), ldc:int(18743)), and:int(ldc:int(4983), ldc:int(126))))
            storeelement:String(expr_157:String[], and:int(ldc:int(10284), ldc:int(908)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(20842), ldc:int(20764)), and:int(ldc:int(2183), ldc:int(4231))))
            storeelement:String(expr_157:String[], and:int(ldc:int(1295), ldc:int(14366)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(5543), ldc:int(10455)), and:int(ldc:int(4318), ldc:int(1198))))
            storeelement:String(expr_157:String[], and:int(ldc:int(21765), ldc:int(533)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(11503), ldc:int(4510)), xor:int(ldc:int(6215), ldc:int(6355))))
            storeelement:String(expr_157:String[], and:int(ldc:int(1586), ldc:int(16391)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(2196), ldc:int(12502)), and:int(ldc:int(3323), ldc:int(12451))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(768), ldc:int(769)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(1203), ldc:int(14567)), xor:int(ldc:int(16391), ldc:int(16553))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(25), ldc:int(26)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(1181), ldc:int(1075)), and:int(ldc:int(4286), ldc:int(17596))))
            storeelement:String(expr_157:String[], and:int(ldc:int(-18087), ldc:int(18086)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(-32056), ldc:int(-32140)), and:int(ldc:int(8401), ldc:int(3299))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(3142), ldc:int(3136)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(12499), ldc:int(1261)), xor:int(ldc:int(1178), ldc:int(1116))))
            storeelement:String(expr_157:String[], xor:int(ldc:int(2579), ldc:int(2583)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(4668), ldc:int(4858)), xor:int(ldc:int(12427), ldc:int(12376))))
            putstatic:String[](\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae::\u9033\u93a2\u4c04\uc31c\u52d3\u3776, expr_157:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u34df\u74b1\u5fe1\u760c\uf995\u61a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66E : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_679 : int
        
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
        var_3_66E = and:int(ldc:int(-1165464692), ldc:int(185200618))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d98\u72f1\u3e2a\u59ec\ud12e\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(-1869523688))
        }
        else {
            var_3_66E = and:int(var_3_66E:int, ldc:int(-1356172849))
            var_5_8A = and:int(ldc:int(10572), ldc:int(-10605))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16664), ldc:int(16663)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_66E:int, ldc:int(1269447101))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(-32506), ldc:int(-32505)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(516), ldc:int(517)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_66E = and:int(var_3_E2:int, ldc:int(-544510072))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(15489), ldc:int(1)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1350433106))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-286030199))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-28132690))
                    }
                    else {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-627199062))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0860)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-2102605214))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1265090730))
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1395354396))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-259369599))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1223113541))
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-446754702))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1368397361))
                            var_11_F3 = and:int(ldc:int(-20362), ldc:int(3849))
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-928240803))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1053971001))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1981537840))
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(22105605))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1826566906))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1164372927))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-85416968))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0860)
                        }
                    }
                    
                    Label_0730:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(447076502))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-46674202))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(539083854))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-582822652))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1540028394))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0860:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1627956064))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1298483602))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(2054666103))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2117729673))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(8195), ldc:int(2197))
                                goto(Label_1139)
                            }
                        }
                    }
                    
                    Label_0973:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2080023908))
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1993847746))
                            goto(Label_0860)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1970456593))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1019806162))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1893339605))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1850536444))
                        var_11_F3 = and:int(ldc:int(-24849), ldc:int(24848))
                    }
                    
                    Label_1139:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1554334291))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-563194907))
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1343641713))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1242:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1650840482))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-399662703))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1139)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1301217917))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1788517644))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1274945951))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1519)
                    }
                    
                    Label_1376:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(61613719))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-448614292))
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1880356151))
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-762373063))
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(818188947))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(2136749501))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_679 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1656281684))
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(758599941))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-35800427))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-117765446))
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1622153314))
                        var_17_679 = add:int(var_16_121:int, xor:int(ldc:int(16640), ldc:int(16641)))
                        looporswitchbreak()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-275101481))
                }
                
                var_3_66E = and:int(var_3_66E:int, ldc:int(-1899010598))
                
                if (cmple:boolean(var_5_8A = var_17_679:int, sub:int(var_6_91:int, and:int(ldc:int(10009), ldc:int(37))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(1231027423))
            goto(Label_0108)
        }
    }
}
