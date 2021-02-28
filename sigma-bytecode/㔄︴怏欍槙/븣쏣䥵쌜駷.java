public class \u3504\ufe34\u600f\u6b0d\u69d9.\ube23\uc3e3\u4975\uc31c\u99f7 {
    public void \ube23\uc3e3\u4975\uc31c\u99f7(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, java.util.Random p1) {
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
            invokespecial:Object(Object::<init>, this:\ube23\uc3e3\u4975\uc31c\u99f7)
            putfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1)
            putfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7, p1:Random)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7e3f\u9a18\ubefe\ub171\u4492\u494c(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p1, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe p3) {
        var_5_61 : int
        var_7_6B : \u2dcc\u34df\ubf56\u8413\ube23\u718f
        var_8_91 : \u2dcc\u34df\ubf56\u8413\ube23\u718f
        var_5_29E : int
        var_9_D8 : \uf995\u6c52\u6d99\u9a18\u40a9
        var_10_DF : \uf995\u6c52\u6d99\u9a18\u40a9
        var_11_110 : int
        var_12_117 : int
        var_13_151 : \u2dcc\u34df\ubf56\u8413\ube23\u718f
        var_14_183 : int
        var_15_18C : int
        var_16_257 : int
        var_5_266 : int
        var_5_397 : int
        expr_1F6 : \ubefe\ud36e\u6b5f\u5f50\u5db4[] [generated]
        var_15_22C : \ubefe\ud36e\u6b5f\u5f50\u5db4[]
        var_16_235 : int
        stack_3B5_0 : int [generated]
        stack_3B5_1 : int [generated]
        var_17_3B9 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_18_3C3 : \uf995\u6c52\u6d99\u9a18\u40a9
        var_19_3DC : \uf995\u6c52\u6d99\u9a18\u40a9
        var_20_400 : String
        var_21_424 : String
        var_22_42D : int
        var_23_457 : int
        var_24_4BB : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_22_6E2 : String
        var_23_706 : String
        var_24_70B : ArrayList
        var_25_714 : int
        var_26_731 : int
        var_27_782 : int
        var_28_7A0 : int
        var_29_7A7 : int
        var_30_7AE : int
        var_27_7F1 : int
        var_31_8D7 : Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>
        var_32_8F4 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_31_805 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_32_84E : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_33_B81 : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
            var_5_61 = and:int(ldc:int(-2089353675), ldc:int(-808521921))
            var_7_6B = initobject:\u2dcc\u34df\ubf56\u8413\ube23\u718f(\u2dcc\u34df\ubf56\u8413\ube23\u718f::<init>, aconstnull:\u718f\u4d85\u71ae\u88c5\ub102())
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            putfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d)
            putfield:String(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\ua562\u9255\u36d3\u8389\uc246\ub113, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f, loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(-29830), ldc:int(28804))))
            var_8_91 = initobject:\u2dcc\u34df\ubf56\u8413\ube23\u718f(\u2dcc\u34df\ubf56\u8413\ube23\u718f::<init>, aconstnull:\u718f\u4d85\u71ae\u88c5\ub102())
            invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\u647c\u1833\u74b1\u2dcc\u183a, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f)
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_8_91:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f), ldc:int(8)))
            putfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, var_8_91:\u2dcc\u34df\ubf56\u8413\ube23\u718f, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f))
            putfield:String(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\ua562\u9255\u36d3\u8389\uc246\ub113, var_8_91:\u2dcc\u34df\ubf56\u8413\ube23\u718f, loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(385), ldc:int(37))))
            
            if (invokeinterface:boolean(List::isEmpty, p2:List)) {
            }
            
            var_5_29E = and:int(var_5_61:int, ldc:int(-681876802))
            var_9_D8 = invokestatic:\uf995\u6c52\u6d99\u9a18\u40a9(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u960f\u64f2\u4c2b\u7e3f\ub6ab\u8aa5, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe)
            var_10_DF = invokestatic:\uf995\u6c52\u6d99\u9a18\u40a9(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u64ab\u62da\u624e\u5d20\u0c95\u647c, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe)
            putfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7, add:int(invokestatic:int(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u97b7\u0a06\u1833\u97e6\uae5d\u0c95, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe), xor:int(ldc:int(8516), ldc:int(8517))))
            putfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7, add:int(invokestatic:int(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u52d3\u9af2\u16f6\ucef1\ub113\u3711, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe), and:int(ldc:int(17417), ldc:int(673))))
            var_11_110 = add:int(invokestatic:int(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u97b7\u0a06\u1833\u97e6\uae5d\u0c95, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe), and:int(ldc:int(1473), ldc:int(10241)))
            var_12_117 = invokestatic:int(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u52d3\u9af2\u16f6\ucef1\ub113\u3711, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe)
            invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u6435\u983f\uc84e\ubb2b\ud217\u6b0d, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f, var_9_D8:\uf995\u6c52\u6d99\u9a18\u40a9, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217), getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7), getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7), var_11_110:int, var_12_117:int)
            invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u6435\u983f\uc84e\ubb2b\ud217\u6b0d, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_8_91:\u2dcc\u34df\ubf56\u8413\ube23\u718f, var_9_D8:\uf995\u6c52\u6d99\u9a18\u40a9, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217), getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7), getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7), var_11_110:int, var_12_117:int)
            var_13_151 = initobject:\u2dcc\u34df\ubf56\u8413\ube23\u718f(\u2dcc\u34df\ubf56\u8413\ube23\u718f::<init>, aconstnull:\u718f\u4d85\u71ae\u88c5\ub102())
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f), ldc:int(19)))
            putfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, var_7_6B:\u2dcc\u34df\ubf56\u8413\ube23\u718f))
            putfield:String(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\ua562\u9255\u36d3\u8389\uc246\ub113, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f, loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(8752), ldc:int(8753))))
            var_14_183 = and:int(ldc:int(-17783), ldc:int(1398))
            var_15_18C = and:int(ldc:int(-8490), ldc:int(8489))
            
            while (cmplt:boolean(var_15_18C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u71ae\u12b2\u7006\u416d\uc31c\u9937, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                if (cmpne:boolean(var_14_183:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_16_257 = sub:int(invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\uf94d\ua61f\uc31c\u5fe1\u7049\u4ab3, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9), and:int(ldc:int(4097), ldc:int(417)))
                
                loop {
                    if (cmpeq:boolean(and:int(var_5_29E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_5_266 = and:int(var_5_29E:int, ldc:int(817788287))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_29E:int, ldc:int(512)), ldc:int(0))) {
                        var_5_266 = and:int(var_5_29E:int, ldc:int(1256282087))
                    }
                    else {
                        var_5_266 = and:int(var_5_29E:int, ldc:int(-139576779))
                        
                        if (cmpge:boolean(var_16_257:int, ldc:int(0))) {
                            if (cmpeq:boolean(var_14_183:int, ldc:int(0))) {
                                if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9, var_16_257:int, var_15_18C:int))) {
                                    goto(Label_0716)
                                }
                                
                                putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), add:int(ldc:int(8), mul:int(sub:int(var_15_18C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))))
                                putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), mul:int(sub:int(var_16_257:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8))))
                                invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\ub32d\u965f\uc246\u67d0\u3bc9\ub83f, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f)
                                invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u6435\u983f\uc84e\ubb2b\ud217\u6b0d, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_13_151:\u2dcc\u34df\ubf56\u8413\ube23\u718f, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217), var_16_257:int, var_15_18C:int, var_16_257:int, var_15_18C:int)
                                var_14_183 = and:int(ldc:int(18129), ldc:int(5))
                                goto(Label_0716)
                            }
                        }
                    }
                    
                    Label_0649:
                    
                    if (cmpne:boolean(and:int(var_5_266:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_5_266:int, ldc:int(67108864)), ldc:int(0))) {
                            var_5_29E = and:int(var_5_266:int, ldc:int(1179497006))
                            loopcontinue()
                        }
                        
                        looporswitchbreak()
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_5_266:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_266:int, ldc:int(512)), ldc:int(0))) {
                        var_5_29E = and:int(var_5_266:int, ldc:int(-2028425820))
                    }
                    else {
                        var_5_29E = and:int(var_5_266:int, ldc:int(-67459532))
                        inc:int(var_16_257, ldc:int(-1))
                    }
                }
                
                var_5_29E = and:int(var_5_266:int, ldc:int(-1556971866))
                inc:int(var_15_18C, ldc:int(1))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_5_29E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_29E = and:int(var_5_29E:int, ldc:int(-1821432218))
                    invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\ub70c\u927d\ubefe\u759a\u4c04\u59ec, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(16)), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, var_9_D8:\uf995\u6c52\u6d99\u9a18\u40a9, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9)
                    invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\ub70c\u927d\ubefe\u759a\u4c04\u59ec, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(27)), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9, checkcast:\uf995\u6c52\u6d99\u9a18\u40a9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uf995\u6c52\u6d99\u9a18\u40a9.class, aconstnull:\uf995\u6c52\u6d99\u9a18\u40a9()))
                    
                    if (invokeinterface:boolean(List<E>::isEmpty, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>)) {
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_29E:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_5_397 = and:int(var_5_29E:int, ldc:int(-946897106))
            expr_1F6 = newarray:\ubefe\ud36e\u6b5f\u5f50\u5db4[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ubefe\ud36e\u6b5f\u5f50\u5db4.class, xor:int(ldc:int(-31742), ldc:int(-31743)))
            storeelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(expr_1F6:\ubefe\ud36e\u6b5f\u5f50\u5db4[], and:int(ldc:int(16753), ldc:int(-20850)), initobject:\uc4d2\uc246\u64ab\u5f50\u6cfe\ua61f[expected:\ubefe\ud36e\u6b5f\u5f50\u5db4](\uc4d2\uc246\u64ab\u5f50\u6cfe\ua61f::<init>, aconstnull:\u718f\u4d85\u71ae\u88c5\ub102()))
            storeelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(expr_1F6:\ubefe\ud36e\u6b5f\u5f50\u5db4[], xor:int(ldc:int(16584), ldc:int(16585)), initobject:\uc910\ub32d\uc4d2\u5bc4\ub7dc[expected:\ubefe\ud36e\u6b5f\u5f50\u5db4](\uc910\ub32d\uc4d2\u5bc4\ub7dc::<init>, aconstnull:\u718f\u4d85\u71ae\u88c5\ub102()))
            storeelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(expr_1F6:\ubefe\ud36e\u6b5f\u5f50\u5db4[], xor:int(ldc:int(385), ldc:int(387)), initobject:\u67e9\u527a\u40a9\ua3b4\u6ec6\u759a[expected:\ubefe\ud36e\u6b5f\u5f50\u5db4](\u67e9\u527a\u40a9\ua3b4\u6ec6\u759a::<init>, aconstnull:\u718f\u4d85\u71ae\u88c5\ub102()))
            var_15_22C = expr_1F6:\ubefe\ud36e\u6b5f\u5f50\u5db4[]
            var_16_235 = and:int(ldc:int(10969), ldc:int(-11002))
            
            while (cmplt:boolean(var_16_235:int, and:int(ldc:int(3), ldc:int(10371)))) {
                stack_3B5_0 = mul:int(ldc:int(8), var_16_235:int)
                
                if (cmpne:boolean(var_16_235:int, and:int(ldc:int(5378), ldc:int(2087)))) {
                    var_5_397 = and:int(var_5_397:int, ldc:int(-2089551252))
                    stack_3B5_1 = and:int(ldc:int(16443), ldc:int(-18496))
                }
                else {
                    stack_3B5_1 = and:int(ldc:int(4111), ldc:int(627))
                }
                
                var_5_397 = and:int(var_5_397:int, ldc:int(-606964867))
                var_17_3B9 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, add:int(stack_3B5_0:int, stack_3B5_1:int))
                var_18_3C3 = loadelement:\uf995\u6c52\u6d99\u9a18\u40a9(invokestatic:\uf995\u6c52\u6d99\u9a18\u40a9[](\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u385b\ud7e8\u8709\u76bc\u52d3\u92ee, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe), var_16_235:int)
                var_19_3DC = ternaryop:\uf995\u6c52\u6d99\u9a18\u40a9(cmpne:boolean(var_16_235:int, and:int(ldc:int(4162), ldc:int(2831))), var_9_D8:\uf995\u6c52\u6d99\u9a18\u40a9, var_10_DF:\uf995\u6c52\u6d99\u9a18\u40a9)
                var_20_400 = ternaryop:String(cmpne:boolean(var_16_235:int, ldc:int(0)), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(3363), ldc:int(16535))), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(10243), ldc:int(10241))))
                var_21_424 = ternaryop:String(cmpne:boolean(var_16_235:int, ldc:int(0)), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(20741), ldc:int(1159))), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(-24053), ldc:int(-24049))))
                var_22_42D = and:int(ldc:int(19801), ldc:int(-28122))
                
                while (cmplt:boolean(var_22_42D:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u71ae\u12b2\u7006\u416d\uc31c\u9937, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                    var_23_457 = and:int(ldc:int(17585), ldc:int(-17594))
                    
                    while (cmplt:boolean(var_23_457:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\uf94d\ua61f\uc31c\u5fe1\u7049\u4ab3, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                        if (cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_23_457:int, var_22_42D:int), and:int(ldc:int(2049), ldc:int(5257)))) {
                            var_24_4BB = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_17_3B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), add:int(ldc:int(8), mul:int(sub:int(var_22_42D:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), mul:int(sub:int(var_23_457:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(-32766), ldc:int(-32764))), var_24_4BB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                            
                            if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_23_457:int, sub:int(var_22_42D:int, xor:int(ldc:int(-32767), ldc:int(-32768)))), xor:int(ldc:int(-30720), ldc:int(-30719))), cmpeq:boolean(and:int(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_18_3C3:\uf995\u6c52\u6d99\u9a18\u40a9, var_23_457:int, sub:int(var_22_42D:int, and:int(ldc:int(513), ldc:int(65)))), ldc:int(8388608)), ldc:int(8388608)))) {
                                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(-32509), ldc:int(-32508))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_24_4BB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(1025), ldc:int(2775)))), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                            }
                            
                            if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_23_457:int, xor:int(ldc:int(1920), ldc:int(1921))), var_22_42D:int), xor:int(ldc:int(384), ldc:int(385))), cmpeq:boolean(and:int(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_18_3C3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_23_457:int, and:int(ldc:int(2129), ldc:int(1))), var_22_42D:int), ldc:int(8388608)), ldc:int(8388608)))) {
                                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(-30707), ldc:int(-30715))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_24_4BB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), xor:int(ldc:int(16769), ldc:int(16768))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), xor:int(ldc:int(12800), ldc:int(12805)))), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                            }
                            
                            if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_23_457:int, add:int(var_22_42D:int, and:int(ldc:int(1281), ldc:int(4173)))), and:int(ldc:int(65), ldc:int(21761))), cmpeq:boolean(and:int(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_18_3C3:\uf995\u6c52\u6d99\u9a18\u40a9, var_23_457:int, add:int(var_22_42D:int, and:int(ldc:int(8257), ldc:int(6179)))), ldc:int(8388608)), ldc:int(8388608)))) {
                                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), var_20_400:String, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_24_4BB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), and:int(ldc:int(16509), ldc:int(6149))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), xor:int(ldc:int(768), ldc:int(769))), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                            }
                            
                            if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_23_457:int, and:int(ldc:int(1), ldc:int(4745))), var_22_42D:int), xor:int(ldc:int(-31727), ldc:int(-31728))), cmpeq:boolean(and:int(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_18_3C3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_23_457:int, and:int(ldc:int(2073), ldc:int(1029))), var_22_42D:int), ldc:int(8388608)), ldc:int(8388608)))) {
                                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), var_21_424:String, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_24_4BB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), xor:int(ldc:int(17426), ldc:int(17427))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), and:int(ldc:int(17793), ldc:int(4121))), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                            }
                        }
                        
                        inc:int(var_23_457, ldc:int(1))
                    }
                    
                    inc:int(var_22_42D, ldc:int(1))
                }
                
                var_22_6E2 = ternaryop:String(cmpne:boolean(var_16_235:int, ldc:int(0)), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(27947), ldc:int(4234))), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(17409), ldc:int(17416))))
                var_23_706 = ternaryop:String(cmpne:boolean(var_16_235:int, ldc:int(0)), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(4110), ldc:int(2060))), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(352), ldc:int(363))))
                var_24_70B = invokestatic:ArrayList(Lists::newArrayList)
                var_25_714 = and:int(ldc:int(-23289), ldc:int(23160))
                
                while (cmplt:boolean(var_25_714:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u71ae\u12b2\u7006\u416d\uc31c\u9937, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                    var_26_731 = and:int(ldc:int(-28014), ldc:int(26989))
                    
                    while (cmplt:boolean(var_26_731:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\uf94d\ua61f\uc31c\u5fe1\u7049\u4ab3, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                        var_27_782 = ternaryop:int(logicaland:boolean(cmpeq:boolean(var_16_235:int, xor:int(ldc:int(6181), ldc:int(6183))), cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, var_25_714:int), xor:int(ldc:int(-32207), ldc:int(-32206)))), xor:int(ldc:int(1088), ldc:int(1089)), and:int(ldc:int(4203), ldc:int(-5868)))
                        
                        if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, var_25_714:int), and:int(ldc:int(4235), ldc:int(8230))), cmpne:boolean(var_27_782:int, ldc:int(0)))) {
                            var_28_7A0 = invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_18_3C3:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, var_25_714:int)
                            var_29_7A7 = and:int(var_28_7A0:int, ldc:int(983040))
                            var_30_7AE = and:int(var_28_7A0:int, ldc:int(65535))
                            var_27_7F1 = ternaryop:int(logicaland:boolean(cmpne:boolean(var_27_782:int, ldc:int(0)), cmpeq:boolean(and:int(var_28_7A0:int, ldc:int(8388608)), ldc:int(8388608))), and:int(ldc:int(51), ldc:int(6405)), and:int(ldc:int(4476), ldc:int(-20861)))
                            invokeinterface:void(List::clear, var_24_70B:ArrayList)
                            
                            if (cmpeq:boolean(and:int(var_28_7A0:int, ldc:int(2097152)), ldc:int(2097152))) {
                                var_31_8D7 = invokevirtual:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>(\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d::iterator, getstatic:\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d(\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d::\u97e6\u3d4b\u3e75\u5654\u9a18\u4ab3))
                                
                                while (invokeinterface:boolean(Iterator::hasNext, var_31_8D7:Iterator)) {
                                    var_32_8F4 = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokeinterface:\u760c\u4975\u4179\uc246\u8640\u64f2(Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>::next, var_31_8D7:Iterator<\u760c\u4975\u4179\uc246\u8640\u64f2>))
                                    
                                    if (cmpne:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_26_731:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_32_8F4:\u760c\u4975\u4179\uc246\u8640\u64f2)), add:int(var_25_714:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_32_8F4:\u760c\u4975\u4179\uc246\u8640\u64f2))), and:int(ldc:int(2049), ldc:int(261)))) {
                                        loopcontinue()
                                    }
                                    
                                    invokeinterface:boolean(List<\u760c\u4975\u4179\uc246\u8640\u64f2>::add, var_24_70B:ArrayList<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:List<\u760c\u4975\u4179\uc246\u8640\u64f2>], var_32_8F4:\u760c\u4975\u4179\uc246\u8640\u64f2)
                                }
                            }
                            
                            var_31_805 = aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()
                            
                            if (invokeinterface:boolean(List::isEmpty, var_24_70B:ArrayList<\u760c\u4975\u4179\uc246\u8640\u64f2>)) {
                                if (cmpeq:boolean(and:int(var_28_7A0:int, ldc:int(1048576)), ldc:int(1048576))) {
                                    var_31_805 = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d)
                                }
                            }
                            else {
                                var_31_805 = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokeinterface:\u760c\u4975\u4179\uc246\u8640\u64f2(List<\u760c\u4975\u4179\uc246\u8640\u64f2>::get, var_24_70B:ArrayList<\u760c\u4975\u4179\uc246\u8640\u64f2>[expected:List<\u760c\u4975\u4179\uc246\u8640\u64f2>], invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokeinterface:int(List<E>::size, var_24_70B:ArrayList<Object>[expected:List<Object>]))))
                            }
                            
                            var_32_84E = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_17_3B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), add:int(ldc:int(8), mul:int(sub:int(var_25_714:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), add:int(ldc:int(-1), mul:int(sub:int(var_26_731:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8))))
                            
                            if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_26_731:int, xor:int(ldc:int(4674), ldc:int(4675))), var_25_714:int)) {
                                if (logicalnot:boolean(invokevirtual:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u6435\uc246\u67d0\u446c\u3e2a\u72f1, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_26_731:int, xor:int(ldc:int(1793), ldc:int(1792))), var_25_714:int, var_16_235:int, var_30_7AE:int))) {
                                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), ternaryop:String(cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), var_22_6E2:String, var_23_706:String), var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                                }
                            }
                            
                            if (cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_26_731:int, xor:int(ldc:int(-31744), ldc:int(-31743))), var_25_714:int), xor:int(ldc:int(129), ldc:int(128)))) {
                                if (cmpeq:boolean(var_27_7F1:int, ldc:int(0))) {
                                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), ternaryop:String(cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), var_22_6E2:String, var_23_706:String), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(8)), p1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                                }
                            }
                            
                            if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, add:int(var_25_714:int, xor:int(ldc:int(16645), ldc:int(16644))))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u6435\uc246\u67d0\u446c\u3e2a\u72f1, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, add:int(var_25_714:int, and:int(ldc:int(17417), ldc:int(6325))), var_16_235:int, var_30_7AE:int))) {
                                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), ternaryop:String(cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), var_22_6E2:String, var_23_706:String), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(7)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                                }
                            }
                            
                            if (cmpeq:boolean(invokevirtual:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u4bc8\ud171\uc29a\u527a\ubded\u527a, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, sub:int(var_25_714:int, xor:int(ldc:int(326), ldc:int(327)))), xor:int(ldc:int(808), ldc:int(809)))) {
                                if (cmpeq:boolean(var_27_7F1:int, ldc:int(0))) {
                                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), ternaryop:String(cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), var_22_6E2:String, var_23_706:String), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), xor:int(ldc:int(212), ldc:int(213))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                                }
                            }
                            
                            if (cmpne:boolean(var_29_7A7:int, ldc:int(65536))) {
                                if (logicaland:boolean(cmpeq:boolean(var_29_7A7:int, ldc:int(131072)), cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2()))) {
                                    invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u1187\u4d85\u4ab3\ube23\ub18d\ua562, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u8640\u3d4b\u3e75\u8389\ua068\u62da, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, var_26_731:int, var_25_714:int, var_16_235:int, var_30_7AE:int), var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, loadelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(var_15_22C:\ubefe\ud36e\u6b5f\u5f50\u5db4[], var_16_235:int), ternaryop:int[expected:boolean](cmpne:boolean(and:int(var_28_7A0:int, ldc:int(4194304)), ldc:int(4194304)), and:int(ldc:int(-29552), ldc:int(8969)), and:int(ldc:int(1049), ldc:int(18497))))
                                }
                                else {
                                    if (cmpeq:boolean(var_29_7A7:int, ldc:int(262144))) {
                                        if (cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, aconstnull:\u760c\u4975\u4179\uc246\u8640\u64f2())) {
                                            if (cmpne:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                                                var_33_B81 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ub7dc\u7e3f\u7d52\ub8be\u385b\ub7dc, var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2)
                                                
                                                if (logicalnot:boolean(invokevirtual:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\u6435\uc246\u67d0\u446c\u3e2a\u72f1, p3:\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe, var_19_3DC:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_26_731:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_33_B81:\u760c\u4975\u4179\uc246\u8640\u64f2)), add:int(var_25_714:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_33_B81:\u760c\u4975\u4179\uc246\u8640\u64f2)), var_16_235:int, var_30_7AE:int))) {
                                                    var_33_B81 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, var_33_B81:\u760c\u4975\u4179\uc246\u8640\u64f2)
                                                }
                                                
                                                invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u71ae\u5db4\u647c\uc229\u92ee\u3bd6, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, var_33_B81:\u760c\u4975\u4179\uc246\u8640\u64f2, var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, loadelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(var_15_22C:\ubefe\ud36e\u6b5f\u5f50\u5db4[], var_16_235:int))
                                                goto(Label_1992)
                                            }
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(var_29_7A7:int, ldc:int(262144))) {
                                        if (cmpeq:boolean(var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                                            invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u8c8a\u56bd\uc84e\u6b0d\u6198\ud158, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, loadelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(var_15_22C:\ubefe\ud36e\u6b5f\u5f50\u5db4[], var_16_235:int))
                                        }
                                    }
                                }
                            }
                            else {
                                invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u6bb9\ua6bd\u3c25\u8640\u4c04\u4ab3, this:\ube23\uc3e3\u4975\uc31c\u99f7, p2:List<\uc84e\u74b1\u5db4\u3711\ub19c>, var_32_84E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, var_31_805:\u760c\u4975\u4179\uc246\u8640\u64f2, loadelement:\ubefe\ud36e\u6b5f\u5f50\u5db4(var_15_22C:\ubefe\ud36e\u6b5f\u5f50\u5db4[], var_16_235:int))
                            }
                        }
                        
                        Label_1992:
                        inc:int(var_26_731, ldc:int(1))
                    }
                    
                    inc:int(var_25_714, ldc:int(1))
                }
                
                inc:int(var_16_235, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6435\u983f\uc84e\ubb2b\ud217\u6b0d(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u2dcc\u34df\ubf56\u8413\ube23\u718f p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uf995\u6c52\u6d99\u9a18\u40a9 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3, int p4, int p5, int p6, int p7) {
        var_9_1BA : int
        var_11_67 : int
        var_12_6B : int
        var_13_6F : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
            var_9_1BA = and:int(ldc:int(-1633570547), ldc:int(-1102650567))
            var_11_67 = p4:int
            var_12_6B = p5:int
            var_13_6F = p3:\u760c\u4975\u4179\uc246\u8640\u64f2
            
            loop {
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0477)
                }
                
                if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(8192)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(62197855))
                    goto(Label_0391)
                }
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(64)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(607776570))
                    goto(Label_0299)
                }
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(8)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(-562306759))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p2:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_11_67:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)), add:int(var_12_6B:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))))) {
                        invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u836c\uceb8\u8cae\ud171\u5bc4\u4cd9, this:\ube23\uc3e3\u4975\uc31c\u99f7, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)
                        p3 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ub7dc\u7e3f\u7d52\ub8be\u385b\ub7dc, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)
                        
                        if (cmpne:boolean(var_11_67:int, p6:int)) {
                            goto(Label_0477)
                        }
                        
                        if (cmpne:boolean(var_12_6B:int, p7:int)) {
                            goto(Label_0477)
                        }
                        
                        if (cmpeq:boolean(var_13_6F:\u760c\u4975\u4179\uc246\u8640\u64f2, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)) {
                            goto(Label_0587)
                        }
                        
                        goto(Label_0477)
                    }
                }
                
                Label_0200:
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(524288)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(-1853633948))
                    goto(Label_0477)
                }
                
                if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(8)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(1229734069))
                    goto(Label_0391)
                }
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_9_1BA = and:int(var_9_1BA:int, ldc:int(1574441104))
                        loopcontinue()
                    }
                    
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(-1624329927))
                    
                    if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p2:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_11_67:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)), add:int(var_12_6B:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)))) {
                        if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p2:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(add:int(var_11_67:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u873d\u3dd3\u6c56\u5d20\uc31c\ud523, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))), add:int(add:int(var_12_6B:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u873d\u3dd3\u6c56\u5d20\uc31c\ud523, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))))) {
                            invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\u59ec\uceb8\u7330\ucef1\ud217\ud217, this:\ube23\uc3e3\u4975\uc31c\u99f7, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)
                            var_11_67 = add:int(var_11_67:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))
                            var_12_6B = add:int(var_12_6B:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))
                            p3 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u873d\u3dd3\u6c56\u5d20\uc31c\ud523, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)
                            goto(Label_0587)
                        }
                    }
                }
                
                Label_0299:
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(4194304)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(1372267028))
                    goto(Label_0477)
                }
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_9_1BA = and:int(var_9_1BA:int, ldc:int(-2025695624))
                        loopcontinue()
                    }
                    
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(-31332083))
                    var_11_67 = add:int(var_11_67:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))
                    var_12_6B = add:int(var_12_6B:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))
                    
                    if (cmpeq:boolean(var_11_67:int, p6:int)) {
                        if (cmpeq:boolean(var_12_6B:int, p7:int)) {
                            if (cmpeq:boolean(var_13_6F:\u760c\u4975\u4179\uc246\u8640\u64f2, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)) {
                                goto(Label_0587)
                            }
                        }
                    }
                }
                
                Label_0391:
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(8)), ldc:int(0))) {
                        var_9_1BA = and:int(var_9_1BA:int, ldc:int(-1189898552))
                        goto(Label_0200)
                    }
                    
                    if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_9_1BA = and:int(var_9_1BA:int, ldc:int(-1777077795))
                        invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\ub32d\u965f\uc246\u67d0\u3bc9\ub83f, this:\ube23\uc3e3\u4975\uc31c\u99f7, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)
                        goto(Label_0587)
                    }
                    
                    loopcontinue()
                }
                
                Label_0477:
                
                if (cmpne:boolean(and:int(var_9_1BA:int, ldc:int(524288)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(1989451672))
                    goto(Label_0391)
                }
                
                if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(33554432)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(218668715))
                    goto(Label_0299)
                }
                
                if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_9_1BA:int, ldc:int(8)), ldc:int(0))) {
                    var_9_1BA = and:int(var_9_1BA:int, ldc:int(552249840))
                    loopcontinue()
                }
                
                var_9_1BA = and:int(var_9_1BA:int, ldc:int(-1231771761))
                invokespecial:void(\ube23\uc3e3\u4975\uc31c\u99f7::\ub32d\u965f\uc246\u67d0\u3bc9\ub83f, this:\ube23\uc3e3\u4975\uc31c\u99f7, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)
                Label_0587:
                var_9_1BA = and:int(var_9_1BA:int, ldc:int(-1773617765))
                
                if (cmpne:boolean(var_11_67:int, p6:int)) {
                    loopcontinue()
                }
                
                if (cmpne:boolean(var_12_6B:int, p7:int)) {
                    loopcontinue()
                }
                
                if (cmpne:boolean(var_13_6F:\u760c\u4975\u4179\uc246\u8640\u64f2, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub70c\u927d\ubefe\u759a\u4c04\u59ec(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uf995\u6c52\u6d99\u9a18\u40a9 p3, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uf995\u6c52\u6d99\u9a18\u40a9 p4) {
        var_6_159E : int
        var_8_6C : int
        var_9_14C : int
        var_10_875 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        stack_1364_0 : int [generated]
        stack_289_0 : int [generated]
        var_11_289 : int
        var_11_880 : boolean
        var_11_1364 : int
        var_12_1549 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_6_159E = and:int(ldc:int(53175557), ldc:int(1528954839))
            var_8_6C = and:int(ldc:int(-19642), ldc:int(19513))
            
            loop {
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_4577)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-68665980))
                    goto(Label_1860)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0254)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16384)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-204114148))
                    
                    if (cmplt:boolean(var_8_6C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u71ae\u12b2\u7006\u416d\uc31c\u9937, p3:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                        var_9_14C = and:int(ldc:int(-29689), ldc:int(28920))
                        goto(Label_0334)
                    }
                }
                
                Label_0173:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(745672585))
                    goto(Label_4577)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1082556526))
                    goto(Label_1860)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(361235451))
                        loopcontinue()
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1950095908))
                    
                    if (cmpne:boolean(p4:\uf995\u6c52\u6d99\u9a18\u40a9, aconstnull:\uf995\u6c52\u6d99\u9a18\u40a9())) {
                        var_8_6C = and:int(ldc:int(13380), ldc:int(-13381))
                        goto(Label_1860)
                    }
                }
                
                Label_0254:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1138087802))
                    goto(Label_4577)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1860)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0173)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(523630513))
                    var_8_6C = and:int(ldc:int(-32627), ldc:int(31584))
                    goto(Label_4567)
                }
                
                loopcontinue()
                Label_0334:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1426987220))
                    goto(Label_4751)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_4668)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_2045)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(492451024))
                    goto(Label_1951)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(991756953))
                }
                else {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(453866891))
                    
                    if (cmplt:boolean(var_9_14C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\uf94d\ua61f\uc31c\u5fe1\u7049\u4ab3, p3:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                        var_10_875 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), add:int(ldc:int(8), mul:int(sub:int(var_8_6C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), mul:int(sub:int(var_9_14C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))
                        
                        if (cmpeq:boolean(p4:\uf995\u6c52\u6d99\u9a18\u40a9, aconstnull:\uf995\u6c52\u6d99\u9a18\u40a9())) {
                            goto(Label_0566)
                        }
                        
                        if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p4:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, var_8_6C:int))) {
                            goto(Label_0566)
                        }
                        
                        stack_1364_0 = stack_289_0 = xor(ldc(10880), ldc(10881))
                        goto(Label_0633)
                    }
                }
                
                Label_0428:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-113327928))
                    goto(Label_4751)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_4668)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_2045)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1460353808))
                    goto(Label_1951)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(51608848))
                    inc:int(var_8_6C, ldc:int(1))
                    loopcontinue()
                }
                
                goto(Label_0334)
                Label_0566:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(854426603))
                    goto(Label_4890)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(524154844))
                stack_1364_0 = stack_289_0 = and(ldc(25127), ldc(-25384))
                Label_0633:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_4947)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(1532098310))
                var_11_289 = stack_289_0:int
                
                if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, var_8_6C:int)) {
                    if (cmpeq:boolean(var_11_289:int, ldc:int(0))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(9263), ldc:int(77))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\uc2bd\u624e\u6198\ub83f\u62da, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int(ldc:int(12327), ldc:int(1027))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                        
                        if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_9_14C:int, xor:int(ldc:int(-32208), ldc:int(-32207))), var_8_6C:int)) {
                            goto(Label_0923)
                        }
                        
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(4160), ldc:int(4174))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(6)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                        goto(Label_0923)
                    }
                }
                
                Label_0663:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_5209)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1320185327))
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_4196)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1341817155))
                    goto(Label_3277)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-575074917))
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_2877)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_2635)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2419)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2190)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2048375568))
                    goto(Label_1358)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2121299279))
                    goto(Label_1139)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1825475164))
                    inc:int(var_9_14C, ldc:int(1))
                    goto(Label_0334)
                }
                
                Label_0923:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_5209)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1557471792))
                    goto(Label_4196)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1496043037))
                    goto(Label_3277)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(617190475))
                    goto(Label_3062)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_2877)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_2635)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-845281246))
                    goto(Label_2419)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1030729611))
                    goto(Label_2190)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1358)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1433352714))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1533239025))
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-945427000))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_9_14C:int, xor:int(ldc:int(5126), ldc:int(5127))), var_8_6C:int))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(14863), ldc:int(1422))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(-9997), ldc:int(9996))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(7)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                    }
                }
                
                Label_1139:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(633018865))
                    goto(Label_5209)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_4978)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_4196)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-98305024))
                    goto(Label_3277)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1304354079))
                    goto(Label_2877)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-663814946))
                    goto(Label_2635)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-577580447))
                    goto(Label_2419)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(670342481))
                    goto(Label_2190)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(2059950833))
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1729623474))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, sub:int(var_8_6C:int, and:int(ldc:int(583), ldc:int(25657)))))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(8270), ldc:int(21663))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), xor:int(ldc:int(4424), ldc:int(4425))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                    }
                }
                
                Label_1358:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_5209)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_4196)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1938268316))
                    goto(Label_3277)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1339775996))
                    goto(Label_3062)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_2877)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-185452384))
                    goto(Label_2635)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_2419)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1776407861))
                    goto(Label_2190)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2131809555))
                    goto(Label_1139)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1997720313))
                    goto(Label_0923)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0663)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(1475476937))
                
                if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, add:int(var_8_6C:int, and:int(ldc:int(2053), ldc:int(17809))))) {
                    goto(Label_0663)
                }
                
                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(7198), ldc:int(558))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(6)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                goto(Label_0663)
                Label_1860:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2079399422))
                    goto(Label_4577)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(2104987427))
                    goto(Label_0254)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0173)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(466576860))
                
                if (cmpge:boolean(var_8_6C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u71ae\u12b2\u7006\u416d\uc31c\u9937, p3:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                    goto(Label_0254)
                }
                
                var_9_14C = and:int(ldc:int(-24481), ldc:int(23456))
                Label_1951:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_4751)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1403114390))
                    goto(Label_4668)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-736375305))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1535128373))
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0334)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(724166601))
                    
                    if (cmplt:boolean(var_9_14C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\uf94d\ua61f\uc31c\u5fe1\u7049\u4ab3, p3:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                        var_10_875 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), add:int(ldc:int(8), mul:int(sub:int(var_8_6C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), mul:int(sub:int(var_9_14C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))
                        var_11_880 = invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p4:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, var_8_6C:int)
                        
                        if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, var_8_6C:int))) {
                            goto(Label_2190)
                        }
                        
                        if (logicalnot:boolean(var_11_880:boolean)) {
                            goto(Label_2190)
                        }
                        
                        if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_9_14C:int, and:int(ldc:int(24577), ldc:int(3729))), var_8_6C:int)) {
                            goto(Label_2419)
                        }
                        
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(24581), ldc:int(24586))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                        goto(Label_2419)
                    }
                }
                
                Label_2045:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_4751)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_4668)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1951)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0428)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1379698099))
                    goto(Label_0334)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(1204518309))
                inc:int(var_8_6C, ldc:int(1))
                goto(Label_1860)
                Label_2190:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(851503136))
                    goto(Label_5209)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-212065768))
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(846481909))
                    goto(Label_4196)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_3277)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1132555718))
                    goto(Label_2877)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2635)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1324446985))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-1442142421))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1601402645))
                        inc:int(var_9_14C, ldc:int(1))
                        goto(Label_1951)
                    }
                    
                    goto(Label_0663)
                }
                
                Label_2419:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_5209)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_4978)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1673748017))
                    goto(Label_4196)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_3277)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1176066760))
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(274536749))
                    goto(Label_2877)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1521137941))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-380783519))
                        goto(Label_2190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(574023058))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(93546032))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1486656092))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_9_14C:int, xor:int(ldc:int(-32767), ldc:int(-32768))), var_8_6C:int))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(655), ldc:int(640))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), xor:int(ldc:int(17426), ldc:int(17427))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                    }
                }
                
                Label_2635:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_5209)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-518994627))
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-355370095))
                    goto(Label_4196)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_3277)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1395414353))
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(2015327938))
                        goto(Label_2419)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(957306780))
                        goto(Label_2190)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-1482513511))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(557769001))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-1462883939))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1362531532))
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-541065756))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, sub:int(var_8_6C:int, and:int(ldc:int(8777), ldc:int(17697)))))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(16399), ldc:int(4399))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), and:int(ldc:int(-3119), ldc:int(3118))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), and:int(ldc:int(113), ldc:int(2819))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                    }
                }
                
                Label_2877:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-585059055))
                    goto(Label_5209)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1318498796))
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_4196)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_3277)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-667702175))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1468799116))
                        goto(Label_2635)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2419)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_2190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(328691011))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, add:int(var_8_6C:int, and:int(ldc:int(28673), ldc:int(3371)))))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(815), ldc:int(4239))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(6)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(7)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                    }
                }
                
                Label_3062:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1609579136))
                    goto(Label_5209)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1469899443))
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-125041703))
                    goto(Label_4196)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_3800)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_2877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_2635)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-120244949))
                        goto(Label_2419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_2190)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1659397798))
                        goto(Label_1358)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-1394009412))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1065380977))
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1731687757))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_9_14C:int, and:int(ldc:int(2245), ldc:int(11))), var_8_6C:int))) {
                        if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, sub:int(var_8_6C:int, and:int(ldc:int(5811), ldc:int(16449))))) {
                            goto(Label_3800)
                        }
                        
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(16626), ldc:int(8217))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), xor:int(ldc:int(-20475), ldc:int(-20473))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                        goto(Label_3800)
                    }
                }
                
                Label_3277:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1626543376))
                    goto(Label_5209)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1564188400))
                    goto(Label_4196)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(979816127))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_3062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1988306011))
                        goto(Label_2877)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1742348234))
                        goto(Label_2635)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_2190)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1803513261))
                    
                    if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_9_14C:int, xor:int(ldc:int(16400), ldc:int(16401))), var_8_6C:int)) {
                        goto(Label_2190)
                    }
                    
                    if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, sub:int(var_8_6C:int, xor:int(ldc:int(-31738), ldc:int(-31737))))) {
                        goto(Label_4196)
                    }
                    
                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(16388), ldc:int(16404))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), and:int(ldc:int(114), ldc:int(18306))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), xor:int(ldc:int(338), ldc:int(339))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                    goto(Label_4196)
                }
                
                Label_3800:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-968678617))
                    goto(Label_5209)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1794441471))
                    goto(Label_4978)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_3277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1990591997))
                        goto(Label_3062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1127491633))
                        goto(Label_2877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_2635)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-33603475))
                        goto(Label_2419)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-722650159))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(2032862948))
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1411123727))
                    
                    if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, add:int(var_8_6C:int, xor:int(ldc:int(520), ldc:int(521))))) {
                        goto(Label_3277)
                    }
                    
                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(10256), ldc:int(382))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(8)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(7)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                    goto(Label_3277)
                }
                
                Label_4196:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1187106029))
                    goto(Label_5209)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1962311683))
                    goto(Label_4978)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-698927615))
                    goto(Label_3800)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_3277)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_2877)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2635)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_2419)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_2190)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1358)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-193460409))
                    goto(Label_1139)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(934308819))
                    goto(Label_0923)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0663)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(1808791478))
                
                if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, add:int(var_8_6C:int, and:int(ldc:int(17417), ldc:int(51))))) {
                    goto(Label_2190)
                }
                
                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(786), ldc:int(30768))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), and:int(ldc:int(5351), ldc:int(8713))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(8)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                goto(Label_2190)
                Label_4567:
                
                if (cmplt:boolean(var_8_6C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\u71ae\u12b2\u7006\u416d\uc31c\u9937, p3:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                    var_9_14C = and:int(ldc:int(-2621), ldc:int(2620))
                    goto(Label_4668)
                }
                
                Label_4577:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(404411702))
                    goto(Label_1860)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0254)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2142298603))
                    goto(Label_0173)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1588220435))
                    loopcontinue()
                }
                
                looporswitchbreak()
                Label_4668:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-1287182987))
                        goto(Label_2045)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-206461209))
                        goto(Label_1951)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0334)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(727051679))
                    
                    if (cmplt:boolean(var_9_14C:int, invokestatic:int(\uf995\u6c52\u6d99\u9a18\u40a9::\uf94d\ua61f\uc31c\u5fe1\u7049\u4ab3, p3:\uf995\u6c52\u6d99\u9a18\u40a9))) {
                        var_10_875 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), add:int(ldc:int(8), mul:int(sub:int(var_8_6C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\u92ee\u4492\u7006\u9a18\uc29a\u8640, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), mul:int(sub:int(var_9_14C:int, getfield:int(\ube23\uc3e3\u4975\uc31c\u99f7::\ud12e\uff55\u183a\u1833\uc2e8\u4179, this:\ube23\uc3e3\u4975\uc31c\u99f7)), ldc:int(8)))
                        
                        if (cmpeq:boolean(p4:\uf995\u6c52\u6d99\u9a18\u40a9, aconstnull:\uf995\u6c52\u6d99\u9a18\u40a9())) {
                            goto(Label_4890)
                        }
                        
                        if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p4:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, var_8_6C:int))) {
                            goto(Label_4890)
                        }
                        
                        stack_1364_0 = stack_289_0 = xor(ldc(20), ldc(21))
                        goto(Label_4947)
                    }
                }
                
                Label_4751:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_4668)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1322122964))
                    goto(Label_2045)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-700163854))
                    goto(Label_1951)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0428)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-673323586))
                    inc:int(var_8_6C, ldc:int(1))
                    goto(Label_4567)
                }
                
                goto(Label_0334)
                Label_4890:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0566)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(-405930166))
                stack_1364_0 = stack_289_0 = and(ldc(-1035), ldc(1034))
                Label_4947:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0633)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(-1009293845))
                var_11_1364 = stack_1364_0:int
                
                if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, var_8_6C:int)) {
                    if (cmpeq:boolean(var_11_1364:int, ldc:int(0))) {
                        if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_9_14C:int, xor:int(ldc:int(8218), ldc:int(8219))), var_8_6C:int)) {
                            goto(Label_5209)
                        }
                        
                        var_12_1549 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(6))
                        
                        if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, add:int(var_8_6C:int, xor:int(ldc:int(24576), ldc:int(24577))))) {
                            goto(Label_5471)
                        }
                        
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(4441), ldc:int(9265))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                        goto(Label_5575)
                    }
                }
                
                Label_4978:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_4196)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_3800)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-224099453))
                        goto(Label_3277)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_3062)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-554088457))
                        goto(Label_2877)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_2635)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2419)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-18790736))
                        goto(Label_2190)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(887369800))
                        goto(Label_1358)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-302706071))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(852871021))
                        goto(Label_0663)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-941394626))
                    inc:int(var_9_14C, ldc:int(1))
                    goto(Label_4668)
                }
                
                Label_5209:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_4978)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_4196)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-652964965))
                    goto(Label_3800)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-96825904))
                    goto(Label_3277)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_3062)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2124720645))
                    goto(Label_2877)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1143269965))
                    goto(Label_2635)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_2419)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_2190)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1358)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(234066864))
                    goto(Label_1139)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(8)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1362333151))
                    goto(Label_0923)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-530899244))
                    goto(Label_0663)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(-1290801158))
                
                if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_9_14C:int, and:int(ldc:int(5323), ldc:int(1))), var_8_6C:int)) {
                    goto(Label_4978)
                }
                
                var_12_1549 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(-9656), ldc:int(9654))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), and:int(ldc:int(-6332), ldc:int(2203)))
                
                if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, add:int(var_8_6C:int, and:int(ldc:int(2893), ldc:int(24739))))) {
                    goto(Label_6075)
                }
                
                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(4175), ldc:int(4190))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                goto(Label_6157)
                Label_5471:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_6157)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(8192)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1745029699))
                    goto(Label_6075)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16384)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(513061330))
                    goto(Label_5683)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(1024)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1921674102))
                }
                else {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(255293413))
                    
                    if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_9_14C:int, and:int(ldc:int(585), ldc:int(24593))), add:int(var_8_6C:int, xor:int(ldc:int(27136), ldc:int(27137))))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(538), ldc:int(5334))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), and:int(ldc:int(18461), ldc:int(8997))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                    }
                }
                
                Label_5575:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-244971430))
                    goto(Label_6157)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1612545841))
                    goto(Label_6075)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-894969981))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4096)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(1210023961))
                        goto(Label_5471)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1416239778))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, sub:int(var_8_6C:int, and:int(ldc:int(6145), ldc:int(26081)))))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(21507), ldc:int(21522))), var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                        goto(Label_5209)
                    }
                }
                
                Label_5683:
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_6157)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1973138742))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_5575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_5471)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(1262087532))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, add:int(var_9_14C:int, and:int(ldc:int(25861), ldc:int(547))), sub:int(var_8_6C:int, and:int(ldc:int(4231), ldc:int(9)))))) {
                        goto(Label_5209)
                    }
                    
                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(21242), ldc:int(1046))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_10_875:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(9)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), and:int(ldc:int(2562), ldc:int(20738))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                    goto(Label_5209)
                }
                
                Label_6075:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_5683)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(16)), ldc:int(0))) {
                        var_6_159E = and:int(var_6_159E:int, ldc:int(-1490796671))
                        goto(Label_5575)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_5471)
                    }
                    
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-2017985053))
                    
                    if (invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_9_14C:int, and:int(ldc:int(10277), ldc:int(17483))), add:int(var_8_6C:int, xor:int(ldc:int(4134), ldc:int(4135))))) {
                        invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(617), ldc:int(635))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(8)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), xor:int(ldc:int(12804), ldc:int(12807))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                    }
                }
                
                Label_6157:
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_6075)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_5683)
                }
                
                if (cmpeq:boolean(and:int(var_6_159E:int, ldc:int(256)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-1657262197))
                    goto(Label_5575)
                }
                
                if (cmpne:boolean(and:int(var_6_159E:int, ldc:int(4194304)), ldc:int(0))) {
                    var_6_159E = and:int(var_6_159E:int, ldc:int(-936982798))
                    goto(Label_5471)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(-943886387))
                
                if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, var_9_14C:int, sub:int(var_8_6C:int, xor:int(ldc:int(288), ldc:int(289)))))) {
                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), xor:int(ldc:int(9517), ldc:int(9532))), var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                    goto(Label_4978)
                }
                
                var_6_159E = and:int(var_6_159E:int, ldc:int(-1210979028))
                
                if (logicalnot:boolean(invokestatic:boolean(\u1187\u2dcc\u8389\uc87f\u71ae\u6cfe::\uc3e3\ube23\u4bc8\uc2e8\u7873\ua068, p3:\uf995\u6c52\u6d99\u9a18\u40a9, sub:int(var_9_14C:int, and:int(ldc:int(2061), ldc:int(9489))), sub:int(var_8_6C:int, xor:int(ldc:int(-27904), ldc:int(-27903)))))) {
                    goto(Label_4978)
                }
                
                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(24090), ldc:int(371))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, var_12_1549:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), and:int(ldc:int(563), ldc:int(4161))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                goto(Label_4978)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud12e\u647c\u1833\u74b1\u2dcc\u183a(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u2dcc\u34df\ubf56\u8413\ube23\u718f p1) {
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
            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(26647), ldc:int(603))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), ldc:int(9)), getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(16)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub32d\u965f\uc246\u67d0\u3bc9\ub83f(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u2dcc\u34df\ubf56\u8413\ube23\u718f p1) {
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
            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), getfield:String(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\ua562\u9255\u36d3\u8389\uc246\ub113, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(8)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u836c\uceb8\u8cae\ud171\u5bc4\u4cd9(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u2dcc\u34df\ubf56\u8413\ube23\u718f p1) {
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
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(-1)))
            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), loadelement:String(getstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc), and:int(ldc:int(380), ldc:int(22676))), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f)))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(-7)))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), ldc:int(-6)))
            putfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u59ec\uceb8\u7330\ucef1\ud217\ud217(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u2dcc\u34df\ubf56\u8413\ube23\u718f p1) {
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
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(8)))
            putfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f, invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, getfield:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u2dcc\u34df\ubf56\u8413\ube23\u718f::\u6fb0\u56bd\u92ee\u5db4\u8d98\u647c, p1:\u2dcc\u34df\ubf56\u8413\ube23\u718f), getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6bb9\ua6bd\u3c25\u8640\u4c04\u4ab3(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ubefe\ud36e\u6b5f\u5f50\u5db4 p4) {
        var_6_63 : int
        var_8_68 : \u7049\u52d3\u8640\u5654\u1833\ub18d
        var_9_73 : String
        var_10_C9 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_8_D1 : \u7049\u52d3\u8640\u5654\u1833\ub18d
        var_10_D9 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_6_63 = and:int(ldc:int(1648542036), ldc:int(-2013352840))
        var_8_68 = getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ud36e\u0b8e\u8d90\ub1b9\u67d0\u72f1)
        var_9_73 = invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u6bb9\u6ec6\uceb8\ub6ab\u7e3f\uf94d, p4:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7))
        
        if (cmpne:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
            if (cmpne:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                goto(Label_0279)
            }
            
            var_8_68 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, var_8_68:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))
        }
        
        Label_0125:
        
        if (cmpne:boolean(and:int(var_6_63:int, ldc:int(524288)), ldc:int(0))) {
            var_6_63 = and:int(var_6_63:int, ldc:int(3856471))
            goto(Label_0322)
        }
        
        if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(262144)), ldc:int(0))) {
            var_10_C9 = invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u5db4\uf9c5\u7bad\ud51e\u3d64\u385b, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, and:int(ldc:int(3073), ldc:int(12457)), and:int(ldc:int(-4453), ldc:int(4452)), and:int(ldc:int(27224), ldc:int(-27358))), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa), var_8_68:\u7049\u52d3\u8640\u5654\u1833\ub18d, ldc:int(7), ldc:int(7))
            var_8_D1 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, var_8_68:\u7049\u52d3\u8640\u5654\u1833\ub18d, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d)
            var_10_D9 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u9255\u4492\u6fb0\u3776\u9255\u5245, var_10_C9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d)
            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), var_9_73:String, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_D9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(14595), ldc:int(-14604)), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_D9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_8_D1:\u7049\u52d3\u8640\u5654\u1833\ub18d))
            return:void()
        }
        
        Label_0279:
        
        if (cmpne:boolean(and:int(var_6_63:int, ldc:int(8388608)), ldc:int(0))) {
            var_6_63 = and:int(var_6_63:int, ldc:int(-155531206))
        }
        else {
            if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0125)
            }
            
            var_6_63 = and:int(var_6_63:int, ldc:int(914845622))
            
            if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                var_8_68 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, var_8_68:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))
                goto(Label_0125)
            }
        }
        
        Label_0322:
        
        if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(2147483647)), ldc:int(0))) {
            var_6_63 = and:int(var_6_63:int, ldc:int(-150112767))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_6_63:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0125)
        }
        
        var_6_63 = and:int(var_6_63:int, ldc:int(-1106262123))
        
        if (cmpne:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
            var_6_63 = and:int(var_6_63:int, ldc:int(-958010027))
            var_9_73 = invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\uf9c5\ub32d\ucfaf\ubcb0\u3bd6\u8c8a, p4:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7))
            goto(Label_0125)
        }
        
        var_8_68 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, var_8_68:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))
        goto(Label_0125)
    }
    
    private void \u1187\u4d85\u4ab3\ube23\ub18d\ua562(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ubefe\ud36e\u6b5f\u5f50\u5db4 p5, boolean p6) {
        var_8_A5D : int
        
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
            var_8_A5D = and:int(ldc:int(-611334020), ldc:int(-218125731))
            
            if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                    invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(2089), ldc:int(28675))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                    return:void()
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_2471)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1170622323))
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1835192119))
                    goto(Label_2082)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1700)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_1495)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1094)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0910)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(65536)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1049380102))
                    goto(Label_0692)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1886696010))
                    goto(Label_0486)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-979533364))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(16577), ldc:int(6153))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uc2e8\u5f50\uc2bd\u3bd6\u3711\ub1b9)))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0270:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_2471)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(524288)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(405118344))
                    goto(Label_2278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1870689713))
                    goto(Label_2082)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(776506042))
                    goto(Label_1898)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-968621519))
                    goto(Label_1700)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-804075692))
                    goto(Label_1495)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-719108640))
                    goto(Label_1094)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1606754974))
                    goto(Label_0910)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1504973563))
                    goto(Label_0692)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-832530939))
                }
                else {
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-661784257))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0486:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-828022385))
                    goto(Label_2471)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-701907454))
                    goto(Label_2278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-778582486))
                    goto(Label_2082)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-871744480))
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(807785647))
                    goto(Label_1700)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(65536)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1806976439))
                    goto(Label_1495)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(15017088))
                    goto(Label_1278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1094)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0910)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1265417344))
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-807429523))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\ua6bd\u67e9\u836c\u4cd9\u67d0\uc246)))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0692:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1491682765))
                    goto(Label_2471)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(426634091))
                    goto(Label_2278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-930524397))
                    goto(Label_2082)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-194288756))
                    goto(Label_1898)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1267808271))
                    goto(Label_1700)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1283356969))
                    goto(Label_1495)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1571173613))
                    goto(Label_1278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1094)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1027643205))
                        goto(Label_0486)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1920860398))
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-139602369))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(2083), ldc:int(1477))), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975)), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uc2e8\u5f50\uc2bd\u3bd6\u3711\ub1b9)))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0910:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(10069836))
                    goto(Label_2471)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2082)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1877041228))
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-74425507))
                    goto(Label_1700)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1495)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-333628126))
                    goto(Label_1278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1779884491))
                        goto(Label_0270)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1318513366))
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1549809284))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_1094:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1605071968))
                    goto(Label_2471)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_2278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_2082)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-814039051))
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1700)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1495)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1460329623))
                }
                else {
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1557370275))
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-959427741))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(524288)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(901666875))
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-807534770))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975)), getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\ua6bd\u67e9\u836c\u4cd9\u67d0\uc246)))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_1278:
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_2471)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(2093416053))
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1351522238))
                    goto(Label_2082)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(65536)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-834878493))
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1024297828))
                    goto(Label_1700)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1062265746))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1507026103))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-975302967))
                        goto(Label_0486)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1790303374))
                        goto(Label_0270)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1721486074))
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1850743924))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u7e3f\u5db4\u51fa\u527a\u8cae\u836c, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), xor:int(ldc:int(3202), ldc:int(3203))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_1495:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1779065414))
                    goto(Label_2471)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-575401068))
                    goto(Label_2082)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-409879759))
                }
                else {
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(495055668))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1374272753))
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1545601595))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1336082640))
                        goto(Label_0486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(4)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1526833743))
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-192029363))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u8c8a\u5db4\u494c\u494c\u88c5\u4ab3, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), xor:int(ldc:int(389), ldc:int(388))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), ldc:int(8)), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_1700:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1077947053))
                    goto(Label_2471)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1292800841))
                    goto(Label_2082)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1611423930))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1304085596))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(65536)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(785064249))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1448071360))
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0486)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1258458664))
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-807537025))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u8c8a\u5db4\u494c\u494c\u88c5\u4ab3, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(7)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(14)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_1898:
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1864268922))
                    goto(Label_2471)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1953119888))
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-948645108))
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1684431245))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1214043591))
                        goto(Label_0486)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1577958106))
                        goto(Label_0270)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1064462529))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u8c8a\u5db4\u494c\u494c\u88c5\u4ab3, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(15)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_2082:
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1091011639))
                    goto(Label_2471)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1888454355))
                }
                else {
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1898)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1700)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1612531215))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(4)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1994891386))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-220008651))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1090434530))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(4)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1726325726))
                        goto(Label_0270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1801598594))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u8c8a\u5db4\u494c\u494c\u88c5\u4ab3, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7), p6:boolean), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)), ldc:int(7)), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), ldc:int(6)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_2278:
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1738801554))
                        goto(Label_2082)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1187804608))
                        goto(Label_1700)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-995651335))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-1290648343))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-939576946))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(1163879327))
                        goto(Label_0486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_8_A5D = and:int(var_8_A5D:int, ldc:int(-892870017))
                        goto(Label_0270)
                    }
                    
                    if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-657470564))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\uc84e\u5bc4\u8d98\u7049\u7043\u4f4a, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), ldc:int(15)), invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_2471:
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(32768)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(2136400785))
                    goto(Label_2278)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(124247148))
                    goto(Label_2082)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(2097152)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(817639163))
                    goto(Label_1898)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1700)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(362520546))
                    goto(Label_1495)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1278)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(67108864)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(-114549007))
                    goto(Label_1094)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0910)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1331729305))
                    goto(Label_0692)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_8_A5D = and:int(var_8_A5D:int, ldc:int(1038615490))
                    goto(Label_0486)
                }
                
                if (cmpne:boolean(and:int(var_8_A5D:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0270)
                }
                
                if (cmpeq:boolean(and:int(var_8_A5D:int, ldc:int(8388608)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_8_A5D = and:int(var_8_A5D:int, ldc:int(-371203523))
                
                if (cmpne:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                    looporswitchbreak()
                }
                
                if (cmpne:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\uc84e\u5bc4\u8d98\u7049\u7043\u4f4a, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(795), ldc:int(7365))), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc)), and:int(ldc:int(-17708), ldc:int(1323))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d))
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u71ae\u5db4\u647c\uc229\u92ee\u3bd6(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ubefe\ud36e\u6b5f\u5f50\u5db4 p5) {
        var_7_33F : int
        var_9_6C : int
        var_10_75 : int
        var_11_78 : \u7049\u52d3\u8640\u5654\u1833\ub18d
        var_12_7D : \u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5
        
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
            var_7_33F = and:int(ldc:int(307034731), ldc:int(1920990967))
            var_9_6C = and:int(ldc:int(-14235), ldc:int(14210))
            var_10_75 = and:int(ldc:int(24728), ldc:int(-25753))
            var_11_78 = p2:\u7049\u52d3\u8640\u5654\u1833\ub18d
            var_12_7D = getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa)
            
            if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                    var_9_6C = ldc:int(-7)
                    goto(Label_0841)
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(128)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(1909466577))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0639)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(75753891))
                    goto(Label_0529)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-1873013270))
                    goto(Label_0451)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0339)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(64)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-563660839))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                            var_9_6C = ldc:int(-7)
                            var_10_75 = ldc:int(6)
                            var_12_7D = getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uc2e8\u5f50\uc2bd\u3bd6\u3711\ub1b9)
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0237:
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(128)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(389209281))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(2097152)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(1378757871))
                    goto(Label_0639)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0529)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(4096)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-525949997))
                    goto(Label_0451)
                }
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-1227277361))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                            var_9_6C = xor:int(ldc:int(-32767), ldc:int(-32768))
                            var_10_75 = ldc:int(14)
                            var_11_78 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0339:
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(1674360898))
                    goto(Label_0639)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(4096)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(1437092208))
                    goto(Label_0529)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-2092415589))
                }
                else {
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0237)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_7_33F = and:int(var_7_33F:int, ldc:int(2025892012))
                        loopcontinue()
                    }
                    
                    var_7_33F = and:int(var_7_33F:int, ldc:int(979435493))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                            var_9_6C = ldc:int(7)
                            var_10_75 = ldc:int(14)
                            var_11_78 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u4e72\ub8be\u52d3\u7e3f\u927d\u7043))
                            var_12_7D = getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uc2e8\u5f50\uc2bd\u3bd6\u3711\ub1b9)
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0451:
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(64)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(226033407))
                    goto(Label_0639)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0339)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-1211223203))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                            var_9_6C = ldc:int(7)
                            var_10_75 = ldc:int(-8)
                            var_11_78 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0529:
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(128)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-1375512256))
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(8192)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(1027498553))
                }
                else {
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_7_33F = and:int(var_7_33F:int, ldc:int(1886672576))
                        goto(Label_0451)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_7_33F = and:int(var_7_33F:int, ldc:int(-123955377))
                        goto(Label_0339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0237)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-1613482115))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))) {
                            var_9_6C = and:int(ldc:int(403), ldc:int(8257))
                            var_10_75 = ldc:int(-8)
                            var_11_78 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ub70c\u92ee\u9a18\u3c25\ub83f\u4975))
                            var_12_7D = getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uc2e8\u5f50\uc2bd\u3bd6\u3711\ub1b9)
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0639:
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(64)), ldc:int(0))) {
                        var_7_33F = and:int(var_7_33F:int, ldc:int(1984407223))
                        goto(Label_0529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_7_33F = and:int(var_7_33F:int, ldc:int(480463403))
                        goto(Label_0339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(1)), ldc:int(0))) {
                        var_7_33F = and:int(var_7_33F:int, ldc:int(-1310767025))
                        loopcontinue()
                    }
                    
                    var_7_33F = and:int(var_7_33F:int, ldc:int(-1092551859))
                    
                    if (cmpeq:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                        if (cmpeq:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))) {
                            var_9_6C = ldc:int(15)
                            var_10_75 = ldc:int(6)
                            var_11_78 = invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u1187\uc229\u600f\u6435\u624e\u6b5f, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0740:
                
                if (cmpne:boolean(and:int(var_7_33F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(164219077))
                    goto(Label_0639)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(512)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(1590769952))
                    goto(Label_0529)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_7_33F = and:int(var_7_33F:int, ldc:int(172873464))
                    goto(Label_0451)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0339)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0237)
                }
                
                if (cmpeq:boolean(and:int(var_7_33F:int, ldc:int(4194304)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_7_33F = and:int(var_7_33F:int, ldc:int(-688522625))
                
                if (cmpne:boolean(p4:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))) {
                    looporswitchbreak()
                }
                
                if (cmpne:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))) {
                    looporswitchbreak()
                }
                
                var_9_6C = ldc:int(15)
                var_12_7D = getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\ua6bd\u67e9\u836c\u4cd9\u67d0\uc246)
                looporswitchbreak()
            }
            
            Label_0841:
            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\ub70c\u183a\u6c56\u8709\u6b5f\u7c6b, p5:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), var_9_6C:int), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)), var_10_75:int), var_11_78:\u7049\u52d3\u8640\u5654\u1833\ub18d, var_12_7D:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8c8a\u56bd\uc84e\u6b0d\u6198\ud158(java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc84e\u74b1\u5db4\u3711\ub19c> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ubefe\ud36e\u6b5f\u5f50\u5db4 p3) {
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
            invokeinterface:boolean(List<\uc84e\u74b1\u5db4\u3711\ub19c>::add, p0:List<\uc84e\u74b1\u5db4\u3711\ub19c>, initobject:\uc84e\u74b1\u5db4\u3711\ub19c(\uc84e\u74b1\u5db4\u3711\ub19c::<init>, getfield:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\ube23\uc3e3\u4975\uc31c\u99f7::\u8aa5\u4e72\u1833\u4179\u5140\ub6ab, this:\ube23\uc3e3\u4975\uc31c\u99f7), invokevirtual:String(\ubefe\ud36e\u6b5f\u5f50\u5db4::\u8d90\u8aa5\uae5d\u183a\ub83f\ubded, p3:\ubefe\ud36e\u6b5f\u5f50\u5db4, getfield:Random(\ube23\uc3e3\u4975\uc31c\u99f7::\u600f\u8389\uc238\u600f\u8d98\u92ee, this:\ube23\uc3e3\u4975\uc31c\u99f7)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc)), and:int(ldc:int(593), ldc:int(11397))), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d, getstatic:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\uceb8\uc238\u4d85\uc3e3\u4bc8\u51fa)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3AF : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_139_0 : byte[] [generated]
        stack_3D3_0 : byte[] [generated]
        stack_411_0 : byte[] [generated]
        stack_475_0 : byte[] [generated]
        stack_4EA_0 : byte[] [generated]
        var_4_39B : int
        var_3_3A0 : byte[]
        var_5_3A1 : int
        expr_475 : byte [generated]
        var_0_4E0 : int
        expr_4EA : byte [generated]
        stack_51A_2 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_3FF : byte[]
        var_5_400 : int
        expr_D7 : int [generated]
        expr_106 : int [generated]
        var_3_145 : String
        stack_394_0 : String[] [generated]
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
        var_0_3AF = and:int(ldc:int(851766164), ldc:int(-321569068))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_104_0 = stack_106_0 = stack_139_0 = stack_3D3_0 = stack_411_0 = stack_475_0 = stack_4EA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("PEtWLVVWL1lVcDQ8OVpPVWxLbk1YUjtcT3pJVWw0OMw8GENnbdxPeklVbDQ2zDwYQ2dv3EeOTVVeMPwcNjxHbdxHjk1VXi78H1Y4P2+7bVosTV1UNEdjY21wPDhGSjxNcVtZX3I0NDQ0PDAJVko6M3HfcjQ0NDQ8LglWSjozU79yTZA6QDwwEDlkTVNx33JNkDpAPC7+N21gTXm6RjQaOk1WNk11VDpEQEw0NDY3bYFaRlJKPDZIO1RAUWthbk1zWDYYRVorbD1URVdgHVROS2w9VE5LZFGPYk2LkEA4QFJEUY9iTYuQQDhATEo0Q11vZ1Q4TXA5ZE1jdlqEkKZ2VA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_39B = expr_6E:int
        var_3_3A0 = newarray:byte[](byte.class, expr_6E:int)
        var_5_3A1 = expr_6E:int
        Label_0931:
        
        while (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_3AF = and:int(var_0_3AF:int, ldc:int(1686583652))
                goto(Label_1112)
            }
            
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(1636629435))
            var_5_3A1 = add:int(var_5_3A1:int, ldc:int(-1))
            storeelement:byte(var_3_3A0:byte[], var_5_3A1:int, xor:byte(add:byte(loadelement:byte(stack_3D3_0:byte[], var_5_3A1:int), ldc:byte(45)), ldc:byte(97)))
            
            if (cmpne:boolean(var_5_3A1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_104_0 = stack_106_0 = stack_139_0 = stack_3D3_0 = stack_411_0 = stack_475_0 = stack_4EA_0 = var_3_3A0:byte[]
            goto(Label_0115)
        }
        
        var_0_3AF = and:int(var_0_3AF:int, ldc:int(1163236741))
        goto(Label_1210)
        Label_1112:
        
        while (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0931)
            }
            
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(-458310919))
            var_5_3A1 = add:int(var_5_3A1:int, ldc:int(-1))
            expr_475 = loadelement:byte(stack_475_0:byte[], var_5_3A1:int)
            storeelement:byte(var_3_3A0:byte[], var_5_3A1:int, or:int(and:int(shl:int(expr_475:byte, xor:int(ldc:int(851), ldc:int(855))), ldc:int(-16)), and:int(shr:int(expr_475:byte[expected:int], xor:int(ldc:int(18433), ldc:int(18437))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_3A1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_104_0 = stack_106_0 = stack_139_0 = stack_3D3_0 = stack_411_0 = stack_475_0 = stack_4EA_0 = var_3_3A0:byte[]
            goto(Label_0220)
        }
        
        Label_1210:
        
        while (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_3AF = and:int(var_0_3AF:int, ldc:int(-1460969340))
                goto(Label_0931)
            }
            
            var_0_4E0 = and:int(var_0_3AF:int, ldc:int(697069311))
            var_5_3A1 = add:int(var_5_3A1:int, ldc:int(-1))
            expr_4EA = loadelement:byte(stack_4EA_0:byte[], var_5_3A1:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_3A1:int, ldc:int(6)), neg:int(var_4_39B:int)), ldc:int(0))) {
                var_0_4E0 = and:int(var_0_4E0:int, ldc:int(2144268245))
                stack_51A_2 = add:byte(expr_4EA:byte, ldc:byte(6))
            }
            else {
                stack_51A_2 = add:byte(expr_4EA:byte, loadelement:byte(var_3_3A0:byte[], add:int(var_5_3A1:int, ldc:int(6))))
            }
            
            var_0_3AF = and:int(var_0_4E0:int, ldc:int(-1346471215))
            storeelement:byte(var_3_3A0:byte[], var_5_3A1:int, stack_51A_2:byte)
            
            if (cmpne:boolean(var_5_3A1:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_104_0 = stack_106_0 = stack_139_0 = stack_3D3_0 = stack_411_0 = stack_475_0 = stack_4EA_0 = var_3_3A0:byte[]
            goto(Label_0267)
        }
        
        var_0_3AF = and:int(var_0_3AF:int, ldc:int(562197553))
        goto(Label_1112)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(1030836369))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(262144)), ldc:int(0))) {
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(-163944450))
        }
        else {
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(815737782))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_3FF = newarray:byte[](byte.class, expr_A7:int)
                var_5_400 = expr_A7:int
                
                loop {
                    var_0_3AF = and:int(var_0_3AF:int, ldc:int(-405295202))
                    var_5_400 = add:int(var_5_400:int, ldc:int(-1))
                    storeelement:byte(var_3_3FF:byte[], var_5_400:int, add:int(shl:int(loadelement:byte(stack_411_0:byte[], var_5_400:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_400:int, xor:int(ldc:int(8472), ldc:int(8473)))), ldc:int(5)), xor:int(ldc:int(13314), ldc:int(13317)))))
                    
                    if (cmpne:boolean(var_5_400:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D5_0 = stack_D7_0 = stack_104_0 = stack_106_0 = stack_139_0 = stack_3D3_0 = stack_411_0 = stack_475_0 = stack_4EA_0 = var_3_3FF:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(64)), ldc:int(0))) {
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(1332258632))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(-41473378))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_39B = expr_D7:int
                var_3_3A0 = newarray:byte[](byte.class, expr_D7:int)
                var_5_3A1 = expr_D7:int
                goto(Label_1112)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_3AF = and:int(var_0_3AF:int, ldc:int(-134122888))
                goto(Label_0115)
            }
            
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(1001357010))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_4_39B = expr_106:int
                var_3_3A0 = newarray:byte[](byte.class, expr_106:int)
                var_5_3A1 = expr_106:int
                goto(Label_1210)
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_3AF:int, ldc:int(8192)), ldc:int(0))) {
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(1477295079))
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_3AF:int, ldc:int(131072)), ldc:int(0))) {
            var_0_3AF = and:int(var_0_3AF:int, ldc:int(761768607))
            goto(Label_0115)
        }
        
        var_3_145 = initobject:String(String::<init>, stack_139_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_394_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(299), ldc:int(318)))
        expr_157 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6205), ldc:int(8215)))
        storeelement:String(expr_157:String[], xor:int(ldc:int(-32481), ldc:int(-32489)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(-5393), ldc:int(5392)), xor:int(ldc:int(-32720), ldc:int(-32709))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(16582), ldc:int(16577)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(1423), ldc:int(43)), xor:int(ldc:int(205), ldc:int(218))))
        storeelement:String(expr_157:String[], and:int(ldc:int(11), ldc:int(8230)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(4143), ldc:int(4152)), and:int(ldc:int(32181), ldc:int(549))))
        storeelement:String(expr_157:String[], and:int(ldc:int(35), ldc:int(9419)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(1163), ldc:int(1198)), and:int(ldc:int(243), ldc:int(8251))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(8334), ldc:int(8330)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(59), ldc:int(16755)), xor:int(ldc:int(27), ldc:int(91))))
        storeelement:String(expr_157:String[], and:int(ldc:int(1167), ldc:int(53)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(846), ldc:int(3137)), and:int(ldc:int(2255), ldc:int(4189))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(1731), ldc:int(1733)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(7359), ldc:int(7410)), and:int(ldc:int(4735), ldc:int(27995))))
        storeelement:String(expr_157:String[], and:int(ldc:int(28787), ldc:int(1047)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(31963), ldc:int(383)), and:int(ldc:int(99), ldc:int(1651))))
        storeelement:String(expr_157:String[], and:int(ldc:int(4283), ldc:int(8715)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(20327), ldc:int(12387)), xor:int(ldc:int(4647), ldc:int(4694))))
        storeelement:String(expr_157:String[], and:int(ldc:int(16412), ldc:int(14)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(19057), ldc:int(497)), and:int(ldc:int(895), ldc:int(12415))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(3395), ldc:int(3402)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(12), ldc:int(115)), xor:int(ldc:int(8815), ldc:int(8930))))
        storeelement:String(expr_157:String[], and:int(ldc:int(9230), ldc:int(23051)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(8335), ldc:int(2509)), xor:int(ldc:int(8262), ldc:int(8413))))
        storeelement:String(expr_157:String[], and:int(ldc:int(10637), ldc:int(5647)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(134), ldc:int(29)), xor:int(ldc:int(17802), ldc:int(17685))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(-30568), ldc:int(-30583)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(12991), ldc:int(1439)), xor:int(ldc:int(1039), ldc:int(1189))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(1280), ldc:int(1294)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(1722), ldc:int(20655)), and:int(ldc:int(4342), ldc:int(8636))))
        storeelement:String(expr_157:String[], and:int(ldc:int(12627), ldc:int(1682)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(16577), ldc:int(16501)), xor:int(ldc:int(1771), ldc:int(1582))))
        storeelement:String(expr_157:String[], and:int(ldc:int(575), ldc:int(19599)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(461), ldc:int(4805)), xor:int(ldc:int(4164), ldc:int(4235))))
        storeelement:String(expr_157:String[], xor:int(ldc:int(-15354), ldc:int(-15338)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(8248), ldc:int(8439)), xor:int(ldc:int(25142), ldc:int(25302))))
        storeelement:String(expr_157:String[], and:int(ldc:int(1205), ldc:int(4436)), invokevirtual:String[expected:String](String::substring, var_3_145:String, xor:int(ldc:int(361), ldc:int(393)), xor:int(ldc:int(8288), ldc:int(8331))))
        storeelement:String(expr_157:String[], and:int(ldc:int(19558), ldc:int(-19559)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(4335), ldc:int(18667)), and:int(ldc:int(16628), ldc:int(6396))))
        storeelement:String(expr_157:String[], and:int(ldc:int(19587), ldc:int(521)), invokevirtual:String[expected:String](String::substring, var_3_145:String, and:int(ldc:int(16636), ldc:int(4340)), xor:int(ldc:int(1251), ldc:int(1052))))
        putstatic:String[](\ube23\uc3e3\u4975\uc31c\u99f7::\u9937\u2dcc\u9937\u47c2\u760c\ub7dc, expr_157:String[])
    }
    
    public void \u3dd3\u3dd3\u8c8a\u5fe1\u965f\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F2 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_5FD : int
        
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
        var_3_5F2 = and:int(ldc:int(-421875154), ldc:int(-446760978))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\uc3e3\u4975\uc31c\u99f7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-186891473))
            var_5_80 = and:int(ldc:int(-19702), ldc:int(18676))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16001), ldc:int(-16066)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_5F2:int, ldc:int(-596003905))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, and:int(ldc:int(17217), ldc:int(12425)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(541), ldc:int(18435)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_5F2 = and:int(var_3_CF:int, ldc:int(-310791380))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(4358), ldc:int(4359)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1286)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-374488397))
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1229231552))
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-436622803))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0513)
                            }
                            
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0378:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1286)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1239303179))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-186967297))
                            var_11_E0 = and:int(ldc:int(18472), ldc:int(-18473))
                            goto(Label_1430)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0513:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1108560755))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-233888511))
                        goto(Label_1286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1986912291))
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1295388731))
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-2020834340))
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1133073951))
                            goto(Label_0378)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1773475987))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-294021202))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0664:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-132873991))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1498249205))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1697084131))
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1533805079))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-85705629))
                            goto(Label_0513)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0378)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-18237568))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-430262338))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0811:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-777765835))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0513)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0378)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-276896146))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(3096), ldc:int(3097))
                                goto(Label_1050)
                            }
                        }
                    }
                    
                    Label_0903:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-608722133))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-451917171))
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0513)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0378)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1695658201))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-998732116))
                        var_11_E0 = and:int(ldc:int(-21796), ldc:int(20769))
                    }
                    
                    Label_1050:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(264570986))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1734287585))
                        goto(Label_1286)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-102109237))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0903)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0513)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0378)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-16871684))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1286)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(2103822559))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1050)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0903)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(3526553))
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0664)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-2039009190))
                            goto(Label_0513)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0378)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-278971858))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1430)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1286:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1384857903))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(2011480361))
                        goto(Label_1050)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-961132131))
                        goto(Label_0903)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(808685710))
                        goto(Label_0513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-603660635))
                        loopcontinue()
                    }
                    
                    var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-704774161))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1430:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FD = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1441:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1286)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1050)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0903)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0664)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1235687948))
                        goto(Label_0513)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-17077713))
                        var_17_5FD = add:int(var_16_10E:int, xor:int(ldc:int(20480), ldc:int(20481)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-304110916))
                
                if (cmple:boolean(var_5_80 = var_17_5FD:int, sub:int(var_6_87:int, xor:int(ldc:int(404), ldc:int(405))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
