public class \u36d3\u9033\u6b0d\u983f\u8d90.\u69d9\u9255\u6d99\ubff1\u0c95 {
    public void \u69d9\u9255\u6d99\ubff1\u0c95(java.io.File p0) {
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
            invokespecial:\u760c\ua3b4\u99f7\u7330\u4975(\u760c\ua3b4\u99f7\u7330\u4975::<init>, this:\u69d9\u9255\u6d99\ubff1\u0c95, p0:File)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u6d69\u8aa5\u983f\ud158\ub171\u718f(java.io.File p0, java.lang.String p1) {
        var_4_64 : String
        
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
            var_4_64 = invokevirtual:String(File::getCanonicalPath, p0:File)
            
            if (getstatic:boolean(\u69d9\u9255\u6d99\ubff1\u0c95::\uceb8\u12b2\u0b8e\uf995\u6b5f\u4daf)) {
                var_4_64 = invokevirtual:String(CharMatcher::replaceFrom, getstatic:CharMatcher(\u69d9\u9255\u6d99\ubff1\u0c95::\u0c95\u4d85\u6cfe\u946b\u4179\uc87f), var_4_64:String[expected:CharSequence], ldc:char(47))
            }
            
            return:boolean(invokevirtual:boolean(String::endsWith, var_4_64:String, p1:String))
        }
        
        goto(Label_0006)
    }
    
    public java.io.InputStream \ubb2b\u4daf\u8d98\u760c\u47c2\u40a9(java.lang.String p0) {
        var_4_65 : File
        
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
        var_4_65 = invokespecial:File(\u69d9\u9255\u6d99\ubff1\u0c95::\u9af2\ua562\ub102\ua61f\u946b\u385b, this:\u69d9\u9255\u6d99\ubff1\u0c95, p0:String)
        
        if (cmpne:boolean(var_4_65:File, aconstnull:File())) {
            return:InputStream(initobject:FileInputStream(FileInputStream::<init>, var_4_65:File))
        }
        
        athrow(initobject:\u3c25\ubcb0\u3e2a\ube23\u67d0(\u3c25\ubcb0\u3e2a\ube23\u67d0::<init>, getfield:File(\u69d9\u9255\u6d99\ubff1\u0c95::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u69d9\u9255\u6d99\ubff1\u0c95), p0:String))
    }
    
    public boolean \u718f\u52d3\u12b2\u93a2\u4179\u97b7(java.lang.String p0) {
        var_2_5F : int
        stack_87_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1877347369), ldc:int(-1143161978))
            
            if (cmpeq:boolean(invokespecial:File(\u69d9\u9255\u6d99\ubff1\u0c95::\u9af2\ua562\ub102\ua61f\u946b\u385b, this:\u69d9\u9255\u6d99\ubff1\u0c95, p0:String), aconstnull:File())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1293356041))
                stack_87_0 = and:int(ldc:int(1669), ldc:int(-6088))
            }
            else {
                stack_87_0 = and:int(ldc:int(1261), ldc:int(1))
            }
            
            return:boolean(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    private java.io.File \u9af2\ua562\ub102\ua61f\u946b\u385b(java.lang.String p0) {
        var_2_5F : int
        var_2_64 : int
        var_4_71 : File
        
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
            var_2_5F = and:int(ldc:int(-388750349), ldc:int(-53633067))
            
            try {
                var_2_64 = and:int(var_2_5F:int, ldc:int(-67633529))
                var_4_71 = initobject:File(File::<init>, getfield:File(\u69d9\u9255\u6d99\ubff1\u0c95::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u69d9\u9255\u6d99\ubff1\u0c95), p0:String)
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_64 = and:int(var_2_64:int, ldc:int(565187545))
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_64 = and:int(var_2_64:int, ldc:int(-1879899830))
                    }
                    else {
                        var_2_64 = and:int(var_2_64:int, ldc:int(-53592357))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(File::isFile, var_4_71:File))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0165:
                    
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_64:int, ldc:int(4)), ldc:int(0))) {
                            var_2_64 = and:int(var_2_64:int, ldc:int(-1960953638))
                            loopcontinue()
                        }
                        
                        var_2_64 = and:int(var_2_64:int, ldc:int(-305683563))
                        
                        if (logicalnot:boolean(invokestatic:boolean(\u69d9\u9255\u6d99\ubff1\u0c95::\u6d69\u8aa5\u983f\ud158\ub171\u718f, var_4_71:File, p0:String))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0208:
                    
                    if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_64:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_64 = and:int(var_2_64:int, ldc:int(1499782445))
                            goto(Label_0165)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_64 = and:int(var_2_64:int, ldc:int(-369799193))
                    }
                    
                    Label_0242:
                    
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_64 = and:int(var_2_64:int, ldc:int(1622757820))
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_64:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2097152)), ldc:int(0))) {
                        return:File(var_4_71:File)
                    }
                    
                    var_2_64 = and:int(var_2_64:int, ldc:int(-1270381839))
                }
            }
            catch (java.io.IOException stack_12F_0) {
            }
            
            return:File(aconstnull:File())
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<java.lang.String> \u8389\ubcb0\u600f\u392e\u927d\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0) {
        var_2_5F : int
        var_4_63 : HashSet
        var_5_74 : File
        var_6_7E : File[]
        var_7_93 : File[]
        var_8_98 : int
        var_9_A1 : int
        var_11_C4 : String
        
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
            var_2_5F = and:int(ldc:int(-2138703658), ldc:int(-1410999430))
            var_4_63 = invokestatic:HashSet(Sets::newHashSet)
            var_5_74 = initobject:File(File::<init>, getfield:File(\u69d9\u9255\u6d99\ubff1\u0c95::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u69d9\u9255\u6d99\ubff1\u0c95), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f))
            var_6_7E = invokevirtual:File[](File::listFiles, var_5_74:File, getstatic:IOFileFilter[expected:FileFilter](DirectoryFileFilter::DIRECTORY))
            
            if (cmpne:boolean(var_6_7E:File[], aconstnull:File[]())) {
                var_7_93 = var_6_7E:File[]
                var_8_98 = arraylength:int(var_7_93:File[])
                var_9_A1 = and:int(ldc:int(27978), ldc:int(-32091))
                
                loop {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1427187486))
                    
                    if (cmpge:boolean(var_9_A1:int, var_8_98:int)) {
                        looporswitchbreak()
                    }
                    
                    var_11_C4 = invokestatic:String(\u760c\ua3b4\u99f7\u7330\u4975::\u7d52\u9937\u759a\u64ab\ua6bd\uc2e8, var_5_74:File, loadelement:File(var_7_93:File[], var_9_A1:int))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_11_C4:String, invokevirtual:String(String::toLowerCase, var_11_C4:String, getstatic:Locale(Locale::ROOT))))) {
                        invokevirtual:void(\u760c\ua3b4\u99f7\u7330\u4975::\u8c8a\uae5d\u8640\ua3b4\u4492\u98a4, this:\u69d9\u9255\u6d99\ubff1\u0c95[expected:\u760c\ua3b4\u99f7\u7330\u4975], var_11_C4:String)
                    }
                    else {
                        invokeinterface:boolean(Set<String>::add, var_4_63:HashSet<String>[expected:Set<String>], invokevirtual:String(String::substring, var_11_C4:String, and:int(ldc:int(67), ldc:int(-68)), sub:int(invokevirtual:int(String::length, var_11_C4:String), and:int(ldc:int(9231), ldc:int(4193)))))
                    }
                    
                    inc:int(var_9_A1, ldc:int(1))
                }
            }
            
            return:Set<String>(var_4_63:HashSet<String>)
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u7bad\ua3b4\u92ff\ub32d\u6198\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, java.lang.String p1, java.lang.String p2, int p3, java.util.function.Predicate<java.lang.String> p4) {
        var_8_72 : File
        var_9_77 : ArrayList
        
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
            var_8_72 = initobject:File(File::<init>, getfield:File(\u69d9\u9255\u6d99\ubff1\u0c95::\u8258\uae87\u5fe1\ud12e\ub7dc\u8709, this:\u69d9\u9255\u6d99\ubff1\u0c95), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f))
            var_9_77 = invokestatic:ArrayList(Lists::newArrayList)
            invokespecial:void(\u69d9\u9255\u6d99\ubff1\u0c95::\u3a62\ube23\u8df4\ub18d\ub102\ub83f, this:\u69d9\u9255\u6d99\ubff1\u0c95, initobject:File(File::<init>, initobject:File(File::<init>, var_8_72:File, p1:String), p2:String), p3:int, p1:String, var_9_77:ArrayList<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p2:String), loadelement:String(getstatic:String[](\u69d9\u9255\u6d99\ubff1\u0c95::\uf9c5\u1187\ud4fe\uae87\u64ab\u8350), and:int(ldc:int(-8795), ldc:int(8778))))), p4:Predicate<String>)
            return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(var_9_77:ArrayList<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
        }
        
        goto(Label_0006)
    }
    
    private void \u3a62\ube23\u8df4\ub18d\ub102\ub83f(java.io.File p0, int p1, java.lang.String p2, java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p3, java.lang.String p4, java.util.function.Predicate<java.lang.String> p5) {
        var_7_8F : int
        var_9_6E : File[]
        var_7_D6 : int
        var_10_DA : File[]
        var_11_DF : int
        var_12_E8 : int
        var_7_EF : int
        var_13_104 : File
        var_14_1A5 : \uc3e3\u3bd6\u6c52\u93a2\uc910\ub102
        
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
            var_7_8F = and:int(and:int(ldc:int(-327949568), ldc:int(-755775544)), ldc:int(-915034368))
            var_9_6E = invokevirtual:File[](File::listFiles, p0:File)
            
            loop {
                if (cmpeq:boolean(and:int(var_7_8F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_7_8F = and:int(var_7_8F:int, ldc:int(-1010523246))
                    goto(Label_0193)
                }
                
                if (cmpeq:boolean(and:int(var_7_8F:int, ldc:int(1)), ldc:int(0))) {
                    var_7_8F = and:int(var_7_8F:int, ldc:int(-472777926))
                    
                    if (cmpeq:boolean(var_9_6E:File[], aconstnull:File[]())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_7_8F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_7_8F = and:int(var_7_8F:int, ldc:int(-2114160367))
                }
                else {
                    if (cmpne:boolean(and:int(var_7_8F:int, ldc:int(262144)), ldc:int(0))) {
                        var_7_8F = and:int(var_7_8F:int, ldc:int(967635237))
                        loopcontinue()
                    }
                    
                    var_7_8F = and:int(var_7_8F:int, ldc:int(-117576727))
                }
                
                Label_0193:
                
                if (cmpne:boolean(and:int(var_7_8F:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_7_8F:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_7_D6 = and:int(var_7_8F:int, ldc:int(-1050680519))
                var_10_DA = var_9_6E:File[]
                var_11_DF = arraylength:int(var_10_DA:File[])
                var_12_E8 = and:int(ldc:int(19493), ldc:int(-19558))
                
                loop {
                    var_7_EF = and:int(var_7_D6:int, ldc:int(-229008531))
                    
                    if (cmpge:boolean(var_12_E8:int, var_11_DF:int)) {
                        looporswitchbreak(Label_0446)
                    }
                    
                    var_7_D6 = and:int(var_7_EF:int, ldc:int(-1059739742))
                    var_13_104 = loadelement:File(var_10_DA:File[], var_12_E8:int)
                    
                    if (invokevirtual:boolean(File::isDirectory, var_13_104:File)) {
                        if (cmpgt:boolean(p1:int, ldc:int(0))) {
                            invokespecial:void(\u69d9\u9255\u6d99\ubff1\u0c95::\u3a62\ube23\u8df4\ub18d\ub102\ub83f, this:\u69d9\u9255\u6d99\ubff1\u0c95, var_13_104:File, sub:int(p1:int, and:int(ldc:int(25), ldc:int(8451))), p2:String, p3:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p4:String), invokevirtual:String(File::getName, var_13_104:File)), loadelement:String(getstatic:String[](\u69d9\u9255\u6d99\ubff1\u0c95::\uf9c5\u1187\ud4fe\uae87\u64ab\u8350), and:int(ldc:int(-29932), ldc:int(29923))))), p5:Predicate<String>)
                        }
                    }
                    else {
                        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(String::endsWith, invokevirtual:String(File::getName, var_13_104:File), loadelement:String(getstatic:String[](\u69d9\u9255\u6d99\ubff1\u0c95::\uf9c5\u1187\ud4fe\uae87\u64ab\u8350), and:int(ldc:int(23053), ldc:int(35))))), invokeinterface:boolean(Predicate<String>::test, p5:Predicate<String>, invokevirtual:String(File::getName, var_13_104:File)))) {
                            try {
                                invokeinterface:boolean(List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::add, p3:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p2:String, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p4:String), invokevirtual:String(File::getName, var_13_104:File)))))
                            }
                            catch (\u494c\u4975\ua068\u0c95\uc84e.\uc3e3\u3bd6\u6c52\u93a2\uc910\ub102 var_14_1A5) {
                                invokeinterface:void(Logger::error, getstatic:Logger(\u69d9\u9255\u6d99\ubff1\u0c95::\u4179\u965f\u9af2\ud523\ud523\uf9c5), invokevirtual:String(Throwable::getMessage, var_14_1A5:\uc3e3\u3bd6\u6c52\u93a2\uc910\ub102[expected:Throwable]))
                            }
                        }
                    }
                    
                    inc:int(var_12_E8, ldc:int(1))
                }
            }
            
            Label_0446:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1C5 : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_132_0 : byte[] [generated]
        stack_1E8_0 : byte[] [generated]
        stack_24B_0 : byte[] [generated]
        stack_2EA_0 : byte[] [generated]
        stack_328_0 : byte[] [generated]
        var_4_1B1 : int
        var_3_1B6 : byte[]
        var_5_1B7 : int
        expr_1E8 : byte [generated]
        var_0_241 : int
        expr_24B : byte [generated]
        stack_293_2 : byte [generated]
        stack_270_0 : byte [generated]
        expr_A6 : int [generated]
        expr_D6 : int [generated]
        var_2_104 : byte[]
        expr_108 : int [generated]
        var_3_316 : byte[]
        var_5_317 : int
        var_0_130 : int
        var_3_13E : String
        stack_18C_0 : String[] [generated]
        expr_150 : String[] [generated]
        stack_373_0 : int [generated]
        
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
        var_0_1C5 = and:int(ldc:int(761940684), ldc:int(-1150614898))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D4_0 = stack_D6_0 = stack_104_0 = stack_106_0 = stack_132_0 = stack_1E8_0 = stack_24B_0 = stack_2EA_0 = stack_328_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("oI4EieH8mDMk")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1B1 = expr_6E:int
        var_3_1B6 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1B7 = expr_6E:int
        Label_0441:
        
        while (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(262144)), ldc:int(0))) {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1933818975))
                goto(Label_0557)
            }
            
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(971972431))
            var_5_1B7 = add:int(var_5_1B7:int, ldc:int(-1))
            expr_1E8 = loadelement:byte(stack_1E8_0:byte[], var_5_1B7:int)
            storeelement:byte(var_3_1B6:byte[], var_5_1B7:int, or:int(and:int(shl:int(expr_1E8:byte, xor:int(ldc:int(514), ldc:int(518))), ldc:int(-16)), and:int(shr:int(expr_1E8:byte[expected:int], xor:int(ldc:int(4616), ldc:int(4620))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1B7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D4_0 = stack_D6_0 = stack_104_0 = stack_106_0 = stack_132_0 = stack_1E8_0 = stack_24B_0 = stack_2EA_0 = stack_328_0 = var_3_1B6:byte[]
            goto(Label_0115)
        }
        
        var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-180970715))
        goto(Label_0697)
        Label_0557:
        
        while (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0441)
            }
            
            var_0_241 = and:int(var_0_1C5:int, ldc:int(-839661768))
            var_5_1B7 = add:int(var_5_1B7:int, ldc:int(-1))
            expr_24B = stack_293_2 = loadelement(stack_24B_0, var_5_1B7)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B7:int, ldc:int(3)), neg:int(var_4_1B1:int)), ldc:int(0))) {
                stack_293_2 = stack_270_0 = add:byte(expr_24B:byte, loadelement:byte(var_3_1B6:byte[], add:int(var_5_1B7:int, ldc:int(3))))
                goto(Label_0640)
            }
            
            Label_0600:
            
            if (cmpne:boolean(and:int(var_0_241:int, ldc:int(1024)), ldc:int(0))) {
                var_0_241 = and:int(var_0_241:int, ldc:int(2124222530))
            }
            else {
                var_0_241 = and:int(var_0_241:int, ldc:int(-806446354))
                stack_293_2 = stack_270_0 = add:byte(expr_24B:byte, ldc:byte(3))
            }
            
            Label_0640:
            
            if (cmpne:boolean(and:int(var_0_241:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0600)
            }
            
            var_0_1C5 = and:int(var_0_241:int, ldc:int(-1619046520))
            storeelement:byte(var_3_1B6:byte[], var_5_1B7:int, stack_293_2:byte)
            
            if (cmpne:boolean(var_5_1B7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D4_0 = stack_D6_0 = stack_104_0 = stack_106_0 = stack_132_0 = stack_1E8_0 = stack_24B_0 = stack_2EA_0 = stack_328_0 = var_3_1B6:byte[]
            goto(Label_0171)
        }
        
        Label_0697:
        
        while (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(1174812757))
                goto(Label_0441)
            }
            
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(1231439631))
            var_5_1B7 = add:int(var_5_1B7:int, ldc:int(-1))
            storeelement:byte(var_3_1B6:byte[], var_5_1B7:int, xor:byte(add:byte(loadelement:byte(stack_2EA_0:byte[], var_5_1B7:int), ldc:byte(5)), ldc:byte(50)))
            
            if (cmpne:boolean(var_5_1B7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D4_0 = stack_D6_0 = stack_104_0 = stack_106_0 = stack_132_0 = stack_1E8_0 = stack_24B_0 = stack_2EA_0 = stack_328_0 = var_3_1B6:byte[]
            goto(Label_0219)
        }
        
        var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1982775875))
        goto(Label_0557)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1772628738))
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(326846644))
            goto(Label_0219)
        }
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1654467009))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_1B1 = expr_A6:int
                var_3_1B6 = newarray:byte[](byte.class, expr_A6:int)
                var_5_1B7 = expr_A6:int
                goto(Label_0557)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(2)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1566010786))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-43619379))
            expr_D6 = arraylength:int(stack_D6_0:byte[])
            
            if (cmpne:boolean(expr_D6:int, ldc:int(0))) {
                var_4_1B1 = expr_D6:int
                var_3_1B6 = newarray:byte[](byte.class, expr_D6:int)
                var_5_1B7 = expr_D6:int
                goto(Label_0697)
            }
        }
        
        Label_0219:
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1046555625))
                goto(Label_0115)
            }
            
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1149781366))
            var_2_104 = stack_104_0:byte[]
            expr_108 = add:int(arraylength:int(stack_106_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_108:int, ldc:int(0))) {
                var_3_316 = newarray:byte[](byte.class, expr_108:int)
                var_5_317 = expr_108:int
                
                loop {
                    var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-805425638))
                    var_5_317 = add:int(var_5_317:int, ldc:int(-1))
                    storeelement:byte(var_3_316:byte[], var_5_317:int, add:int(shl:int(loadelement:byte(stack_328_0:byte[], var_5_317:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_104:byte[], add:int(var_5_317:int, and:int(ldc:int(25145), ldc:int(385)))), ldc:int(3)), xor:int(ldc:int(17), ldc:int(14)))))
                    
                    if (cmpne:boolean(var_5_317:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D4_0 = stack_D6_0 = stack_104_0 = stack_106_0 = stack_132_0 = stack_1E8_0 = stack_24B_0 = stack_2EA_0 = stack_328_0 = var_3_316:byte[]
            }
        }
        
        Label_0269:
        
        if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_1C5:int, ldc:int(582733290))
            goto(Label_0171)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C5:int, ldc:int(1024)), ldc:int(0))) {
            var_0_130 = and:int(var_0_1C5:int, ldc:int(1332381372))
            var_3_13E = initobject:String(String::<init>, stack_132_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_18C_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28636), ldc:int(-28634)))
            expr_150 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(7182), ldc:int(515)))
            storeelement:String(expr_150:String[], xor:int(ldc:int(4117), ldc:int(4116)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(665), ldc:int(-666)), xor:int(ldc:int(2322), ldc:int(2325))))
            storeelement:String(expr_150:String[], and:int(ldc:int(4984), ldc:int(-31609)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, xor:int(ldc:int(101), ldc:int(98)), and:int(ldc:int(264), ldc:int(23564))))
            putstatic:String[](\u69d9\u9255\u6d99\ubff1\u0c95::\uf9c5\u1187\ud4fe\uae87\u64ab\u8350, expr_150:String[])
            putstatic:Logger(\u69d9\u9255\u6d99\ubff1\u0c95::\u4179\u965f\u9af2\ud523\ud523\uf9c5, invokestatic:Logger(LogManager::getLogger))
            
            if (cmpne:boolean(invokestatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc910\u4f4a\uc29a\u61a4\uc87f\u516c), getstatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\u36d3\u8640\u92ff\ub113\u12b2\ud158::\u4bc8\u5fe1\u183a\u8aa5\u392e\ucef1))) {
                var_0_130 = and:int(var_0_130:int, ldc:int(-1342260708))
                stack_373_0 = and:int(ldc:int(23200), ldc:int(-24227))
            }
            else {
                stack_373_0 = and:int(ldc:int(7233), ldc:int(25487))
            }
            
            putstatic:boolean(\u69d9\u9255\u6d99\ubff1\u0c95::\uceb8\u12b2\u0b8e\uf995\u6b5f\u4daf, stack_373_0:boolean)
            putstatic:CharMatcher(\u69d9\u9255\u6d99\ubff1\u0c95::\u0c95\u4d85\u6cfe\u946b\u4179\uc87f, invokestatic:CharMatcher(CharMatcher::is, ldc:char(92)))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u3d64\u3711\ud4fe\u1833\u36d3\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(803233168), ldc:int(-67306004))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u69d9\u9255\u6d99\ubff1\u0c95[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(1542750202))
            var_5_81 = and:int(ldc:int(-22143), ldc:int(21114))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13545), ldc:int(13544)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_660:int, ldc:int(-1410246709))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(9), ldc:int(9223)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(10515), ldc:int(1025)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_D1:int, ldc:int(1878742485))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(11328), ldc:int(11329)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-369444403))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1040951431))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-130035682))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1196795838))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(119717956))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-535453280))
                    }
                    else {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-537526973))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1862032707))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1253856791))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1971978605))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(737307445))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1273100139))
                            var_11_E2 = and:int(ldc:int(22550), ldc:int(-22807))
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0575:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2068836061))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-415487939))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-266371452))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-69011555))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(300052840))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1669904988))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1929641086))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1313157017))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1472370366))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-725878352))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-872784089))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0835:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-457957738))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1919710591))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(602533564))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-732249325))
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(806742951))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(199677920))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(17409), ldc:int(4953))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-412850132))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-522706294))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1574224212))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(736982927))
                        var_11_E2 = and:int(ldc:int(-30287), ldc:int(1614))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-676460810))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(449457293))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1590163079))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(411535893))
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1085216455))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(210561281))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1390402501))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-605169901))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1402)
                            }
                        }
                    }
                    
                    Label_1259:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1907016885))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1843806660))
                            goto(Label_1110)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2135181079))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(113216583))
                            goto(Label_0835)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1694628100))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1878883652))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1519)
                    }
                    
                    Label_1402:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-533874636))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2047885741))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-873048609))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(784106908))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(102134503))
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2075122112))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1610511833))
                        var_17_66B = add:int(var_16_110:int, and:int(ldc:int(16481), ldc:int(141)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(1273943968))
                
                if (cmple:boolean(var_5_81 = var_17_66B:int, sub:int(var_6_88:int, xor:int(ldc:int(-28672), ldc:int(-28671))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
